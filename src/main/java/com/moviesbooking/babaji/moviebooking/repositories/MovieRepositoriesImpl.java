package com.moviesbooking.babaji.moviebooking.repositories;

import com.moviesbooking.babaji.moviebooking.entity.Movie;
import com.moviesbooking.babaji.moviebooking.entity.MovieStatus;
import com.moviesbooking.babaji.moviebooking.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieRepositoriesImpl implements MovieRepositories {

    List<Movie> movies = Arrays.asList(new Movie(new Ticket(1,"1A"), 1,"pashupati",120, MovieStatus.AVAILABLE),
            new Movie(new Ticket(2,"1B"), 2,"sooryabangsi",120, MovieStatus.AVAILABLE),
            new Movie(new Ticket(3,"1C"), 3,"jatra",120, MovieStatus.BOOKED),
            new Movie(new Ticket(4,"1D"), 4,"saayad",120, MovieStatus.BOOKED)
            );


    @Override
    public List<Movie> getAllMovies() {
       return movies;
    }

    @Override
    public Movie getMovieById(int id) {

        for (Movie movie:movies
             ) {


            if (movie.getMovieId()==id){

                return movie;
            }

        }

        return null;
    }

    @Override
    public Ticket getTicketById(int id) {
        for (Movie movie:movies
        ) {


            if (movie.getMovieId()==id){

                return movie.getTicket();
            }

        }


        return null;
    }
}
