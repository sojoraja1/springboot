package com.moviesbooking.babaji.moviebooking.entity;

public class Ticket {

    private int ticketId;
    private String hallSeat;

    public Ticket(int ticketId, String hallSeat) {
        this.ticketId = ticketId;
        this.hallSeat = hallSeat;
    }

    public String getHallSeat() {
        return hallSeat;
    }

    public void setHallSeat(String hallSeat) {
        this.hallSeat = hallSeat;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }


}
