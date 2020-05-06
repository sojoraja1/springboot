package com.moviesbooking.babaji.moviebooking.exceptionhandling;

import java.util.Date;

public class ExceptionResponse {

    private Date timeStamp;
    private String errorMessage;
    private String errorDetail;

    public ExceptionResponse(Date timeStamp, String errorMessage, String errorDetail) {
        this.timeStamp = timeStamp;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
