package org.campus02.fileinputdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args)  {

        File file = new File(".\\data\\demo.txt");
        if (!file.exists()) {
            System.out.println("Datei existiert nicht!");
            //return;
        }

        System.out.println(file.length());

        //FileInputStream fis = null;
        try (FileInputStream fis = new FileInputStream(file)) {
            //fis = new FileInputStream(file);

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                char[] arr = Character.toChars(byteRead);
                //System.out.println("arr.length = " + arr.length);
                System.out.println(arr[0]);
            }
            //fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }*/

    }
}
