package ru.liapkin.springbootthirdappurfu.exception;

public class ValidationFailedException extends Exception {

    public ValidationFailedException(String message) {
        super(message);
    }

}
