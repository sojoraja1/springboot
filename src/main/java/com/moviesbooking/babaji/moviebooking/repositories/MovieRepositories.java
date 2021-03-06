package com.moviesbooking.babaji.moviebooking.repositories;

import com.moviesbooking.babaji.moviebooking.entity.Movie;
import com.moviesbooking.babaji.moviebooking.entity.Ticket;

import java.util.List;

public interface MovieRepositories {

    List<Movie> getAllMovies();

    Movie getMovieById(int id);

    Ticket getTicketById(int id);
}
