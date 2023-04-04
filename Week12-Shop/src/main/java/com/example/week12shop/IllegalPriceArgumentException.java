package com.example.week12shop;

public class IllegalPriceArgumentException extends IllegalArgumentException {
    // passes the message to the parent class to track
    public IllegalPriceArgumentException(String message){
        super(message);
    }
}
