package org.campus02.addressmanager;


public class AddressLoadException extends Exception {
    public AddressLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressLoadException(String message) {
        super(message);
    }
}
