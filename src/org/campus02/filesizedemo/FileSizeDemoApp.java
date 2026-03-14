package org.campus02.filesizedemo;

import java.io.File;

public class FileSizeDemoApp {
    public static void main(String[] args) {
        //D:\temp\ETS26\sub-ordner\dokumente

        /*
        * \ => Escape
        * \t => Tabulator
        * \r => return
        * \n => line feed
        * \\ =>
        * */

        File rootDirectory = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente");
        long totalFileSizes = getFileSizes(rootDirectory);

        System.out.println("size = " + totalFileSizes);
        System.out.println("size [KB] = " + totalFileSizes / 1024.0);
    }

    private static long getFileSizes(File rootDirectory) {
        long totalFileSizes = 0;
        for (File f : rootDirectory.listFiles()) {
            System.out.println(f.getName());
            if (f.isFile()) {
                totalFileSizes = totalFileSizes + f.length();
            }
            else {
                // zwangsläufig ein Directory
                totalFileSizes += getFileSizes(f); // Rekursion
            }
        }
        return totalFileSizes;
    }
}
