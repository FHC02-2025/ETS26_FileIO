package org.campus02.filewritedemo;

import java.io.*;

public class FileOutputStreamDemoApp {

    public static void main(String[] args) {

        File file = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\newfile.txt");

        try (BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(file))) {

            //BufferedOutputStream bos = new BufferedOutputStream(fos);

            bos.write('a');
            bos.write('b');

            //fos.write('a');
            //fos.write('b');

            bos.flush();
            //fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
