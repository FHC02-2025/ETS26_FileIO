package org.campus02.addressmanager;

public class AddressExportException extends Exception {

    public AddressExportException(String message) {
        super(message);
    }

    public AddressExportException(String message, Throwable cause) {
        super(message, cause);
    }
}
