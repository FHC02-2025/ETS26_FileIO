package org.campus02.addressmanager;

public class DemoApp {

    public static void main(String[] args) {

        AddressManager am = new AddressManager();

        try {
            am.loadFromCsv("D:\\temp\\ETS26\\sub-ordner\\dokumente\\adresses.csv",
                    ",");

            System.out.println(am.getAddresses());

            am.exportToCsv("D:\\temp\\ETS26\\sub-ordner\\dokumente\\neu.txt",
                    ";");

        } catch (AddressLoadException e) {
            e.printStackTrace();
        } catch (AddressExportException e) {
            e.printStackTrace();
        }


    }
}
