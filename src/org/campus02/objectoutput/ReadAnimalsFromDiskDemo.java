package org.campus02.objectoutput;


import java.io.*;

public class ReadAnimalsFromDiskDemo {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS26\\sub-ordner\\dokumente\\animals.txt");
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(f)
        )) {

            int count = (int) ois.readObject();
            System.out.println(count);
            Animal a;
            while ((a = (Animal) ois.readObject()) != null)
            {
                System.out.println("o = " + a);

                count--;
                if (count ==0)
                    break;
            }

        }
        catch (EOFException eof) {
            System.out.println("Dokumentende erreicht!");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
