package com.Interfile.intercafe.exception;

/**
 * @author Qiniso Ngobese
 */

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
