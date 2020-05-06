package com.moviesbooking.babaji.moviebooking.services;

import com.moviesbooking.babaji.moviebooking.entity.Movie;
import com.moviesbooking.babaji.moviebooking.entity.Ticket;
import com.moviesbooking.babaji.moviebooking.exceptionhandling.MoviesNotFoundException;
import com.moviesbooking.babaji.moviebooking.exceptionhandling.NoMoviesFoundById;
import com.moviesbooking.babaji.moviebooking.repositories.MovieRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServicesImpl implements MovieServices {
    private final MovieRepositories movieRepositories;

    public MovieServicesImpl(MovieRepositories movieRepositories) {
        this.movieRepositories = movieRepositories;
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies= movieRepositories.getAllMovies();
        if (movies==null){

            throw new MoviesNotFoundException("no books found");
        }
        return movies;
    }

    @Override
    public Movie getMovieById(int id) {
       Movie movies = movieRepositories.getMovieById(id);

       if (movies==null)
           throw new NoMoviesFoundById("No books available for this id");

        return movies;
    }

    @Override
    public Ticket getTicket(int id) {
        return movieRepositories.getTicketById(id);
    }

}
