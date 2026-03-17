package org.campus02.addressmanager;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {

    private ArrayList<Address> addresses = new ArrayList<>();

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void loadFromCsv(String path, String separator)
            throws AddressLoadException {

        File f = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;

            br.readLine();// Die erste Zeile ist der Header, dieser wird ignoriert
            while ((line = br.readLine()) != null) {

                String[] columns = line.split(separator);
                /* columns[0],1,2,3
                firstname,lastname,mobilNumber,email
                Max,Mustermann,+43 664 1234567,max.mustermann@example.at */

                if (columns.length != 4)  {
                    // wir erwarten immer genau 4 Spalten
                    throw new AddressLoadWrongFormatException("Fehler in Zeile: " + line);
                }

                Address address = new Address(columns[0], columns[1], columns[2], columns[3]);
                addresses.add(address);
            }

        } catch (FileNotFoundException e) {
            throw new AddressLoadException("Datei existiert nicht: " + path, e);
        } catch (IOException e) {
            throw new AddressLoadException("Unbekannter Fehler: " + path, e);
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException {

        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(new FileWriter(path))
        )){
           for (Address a : addresses) {
               String line = a.getFirstname() + separator + a.getLastname() + separator
                                + a.getPhoneNumber() + separator + a.getEmail();
               pw.println(line);
           }

           pw.flush();
        } catch (IOException e) {
            throw new AddressExportException("Fehler beim Schreiben: " + path, e);
        }
    }
}
