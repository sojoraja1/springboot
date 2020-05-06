package com.moviesbooking.babaji.moviebooking.services;

import com.moviesbooking.babaji.moviebooking.entity.Movie;
import com.moviesbooking.babaji.moviebooking.entity.Ticket;

import java.util.List;

public interface MovieServices {

    List<Movie> getAllMovies();
    Movie getMovieById(int id);

    Ticket getTicket(int id);
}
