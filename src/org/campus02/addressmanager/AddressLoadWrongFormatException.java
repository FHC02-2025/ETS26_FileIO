package org.campus02.addressmanager;

public class AddressLoadWrongFormatException extends AddressLoadException {

    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

    public AddressLoadWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
