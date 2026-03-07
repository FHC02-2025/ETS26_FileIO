package org.campus02.file;

import java.io.File;

public class FileDemoApp {

    public static void main(String[] args) {

        File dir = new File ("D:\\temp\\ETS26\\sub-ordner\\dokumente");

        System.out.println("dir.isDirectory() = " + dir.isDirectory());
        
        File sample = new File ("D:\\temp\\ETS26\\sub-ordner\\dokumente\\er hörte leise.txt");
        System.out.println("sample.isDirectory() = " + sample.isDirectory());
        System.out.println("sample.length() = " + sample.length());
        System.out.println("sample.length() = " + sample.length() / 1024);
        
        for (File file : dir.listFiles()) {
            System.out.println("file.getName() = " + file.getName());   
        }
    }
}
