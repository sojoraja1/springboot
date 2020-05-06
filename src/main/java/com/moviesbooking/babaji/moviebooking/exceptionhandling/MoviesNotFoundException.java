package com.moviesbooking.babaji.moviebooking.exceptionhandling;

public class MoviesNotFoundException extends RuntimeException {


    public MoviesNotFoundException(String message) {
        super(message);
    }
}
