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

        File dir = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente");

        long size = 0;
        for (File f : dir.listFiles()) {
            System.out.println(f.getName());
            if (f.isFile()) {
                size = size + f.length();
            }
        }

        System.out.println("size = " + size);
        System.out.println("size [KB] = " + size / 1024.0);
    }
}
