package org.campus02.filewritedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoApp {

    public static void main(String[] args) {

        File file = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\newfile.txt");

        try (FileOutputStream fos = new FileOutputStream(file)) {

            fos.write('a');
            fos.write('b');

            fos.flush();
            //fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
