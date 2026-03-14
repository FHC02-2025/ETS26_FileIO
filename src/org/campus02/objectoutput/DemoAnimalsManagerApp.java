package org.campus02.objectoutput;

import java.io.*;

public class DemoAnimalsManagerApp {

    public static void main(String[] args) {

        Animal cat = new Animal("Minka", "black-white", 4);
        Animal bird = new Animal("tweety", "yellow", 2);
        Animal octo = new Animal("Octi", "black", 8);

        /* csv => comma separated values // ; */
        /*Minka,black-white,4
          tweety,yellow,2
          Octi,black,8
         */

        File f = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\animals.txt");

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                             new FileOutputStream(f)))) {

            oos.writeObject((Integer)3);
            oos.writeObject(cat);
            oos.writeObject(bird);
            oos.writeObject(octo);
            //oos.writeObject(null);
            oos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");

    }
}
