package com.example.week12shop;

public class Item {

    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalPriceArgumentException {
        if ( price < 0 ){
            // the string here is part of the exception message - shown when you toString it
            throw new IllegalPriceArgumentException("Price can not be less than 0");
        }
        this.price = price;
    }

    public double getSubtotal(){
        return price * quantity;
    }
}