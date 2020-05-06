package com.moviesbooking.babaji.moviebooking.exceptionhandling;

public class NoMoviesFoundById extends RuntimeException{
    public NoMoviesFoundById(String s) {
        super(s);
    }
}
