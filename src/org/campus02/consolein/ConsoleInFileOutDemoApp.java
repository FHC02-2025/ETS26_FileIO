package org.campus02.consolein;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleInFileOutDemoApp {

    public static void main(String[] args) {

        File file = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\newfile-from-console.txt");

        int countBytes = 0;
        try (FileOutputStream fos = new FileOutputStream(file)) {

            int byteRead = 0;
            do {
                byteRead = System.in.read();
                if ((char) byteRead != 'x') {
                    fos.write(byteRead);
                    countBytes++;
                }
            } while ((char) byteRead != 'x');

            fos.flush();
            System.out.println("Total Bytes written: " + countBytes);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
