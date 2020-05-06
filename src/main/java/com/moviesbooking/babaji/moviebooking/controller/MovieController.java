package com.moviesbooking.babaji.moviebooking.controller;

import com.moviesbooking.babaji.moviebooking.entity.Movie;
import com.moviesbooking.babaji.moviebooking.entity.MovieStatus;
import com.moviesbooking.babaji.moviebooking.entity.Ticket;
import com.moviesbooking.babaji.moviebooking.services.MovieServices;
import com.moviesbooking.babaji.moviebooking.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class MovieController {
    private final MessageSource messageSource;
    private final MovieServices movieServices;

    public MovieController(MovieServices movieServices, MessageSource messageSource) {
        this.movieServices = movieServices;
        this.messageSource = messageSource;
    }

    @GetMapping(Route.ALL)
    public CollectionModel<EntityModel<Movie>> getAllMovies(){
        List<EntityModel<Movie>> books = movieServices.getAllMovies()
                .stream().map(movie -> {

                    if (movie.getMovieStatus().equals(MovieStatus.AVAILABLE)){

                     return  new EntityModel<>(movie, //
                                linkTo(methodOn(MovieController.class).getMovieById(movie.getMovieId())).withRel("movies"),
                             linkTo(methodOn(MovieController.class).getTicketById(movie.getMovieId())).withRel("tickets")
                             );

                    }
                    return  new EntityModel<>(movie, //
                            linkTo(methodOn(MovieController.class).getAllMovies()).withRel("movies"));



                }).collect(Collectors.toList());

        return new CollectionModel<>(books, linkTo(methodOn(MovieController.class).getAllMovies()).withSelfRel());




    }

    @GetMapping(path = "/ticket/{id}")
    public Ticket getTicketById(@PathVariable int id){

        return movieServices.getTicket(id);



    }


    @GetMapping(Route.MOVIEBYID)
    public EntityModel<Movie> getMovieById(@PathVariable int id){
        Movie movie = movieServices.getMovieById(id);
        if (movie.getMovieStatus().equals(MovieStatus.BOOKED)){

            return new EntityModel<>(movie,
                    linkTo(methodOn(MovieController.class).getAllMovies()).withRel("otherMovies"));
        }else{

            return new EntityModel<>(movie,
                    linkTo(methodOn(MovieController.class).getAllMovies()).withRel("checkoutMovies"));
        }





    }

    @GetMapping(path = "/helloworld")
    public String showHelloWorld(@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        return messageSource.getMessage("lang.change",null,locale);
    }

    @GetMapping(path = "/just")
    @ResponseBody
    public String show(@RequestParam(name = "student",required = false) String id){

        return "Dfdf";
    }





}
