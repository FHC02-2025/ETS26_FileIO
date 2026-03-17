package org.campus02.textin;

import java.io.*;
import java.util.Scanner;

public class DemoTextFileIn {

    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\er hörte leise.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            int countLines = 0;
            String line;
            while ((line = br.readLine()) != null ) {
                //line = br.readLine(); // ACHTUNG, kein weiterer Read-Vorgang notwendig
                System.out.println(line);
                countLines++;
            }

            System.out.println("countLines = " + countLines);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally wurde aufgerufen");
        }

    }
}
