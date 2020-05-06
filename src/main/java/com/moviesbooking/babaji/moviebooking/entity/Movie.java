package com.moviesbooking.babaji.moviebooking.entity;

public class Movie {
    private Ticket ticket;
    private int movieId;
    private String movieName;
    private long moviePrice;
    private MovieStatus movieStatus;

    public Movie(Ticket ticket, int movieId, String movieName, long moviePrice, MovieStatus movieStatus) {
        this.ticket = ticket;
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.movieStatus = movieStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public long getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(long moviePrice) {
        this.moviePrice = moviePrice;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }
}
