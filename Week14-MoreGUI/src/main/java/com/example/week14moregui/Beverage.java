package com.example.week14moregui;

import java.util.ArrayList;

public class Beverage {

    private String type;
    private ArrayList<String> milks;

    public Beverage(String type) {
        this.type = type;
        milks = new ArrayList<>();
    }

    public boolean addMilk(String milk){
        return milks.add(milk);
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getMilks() {
        return new ArrayList<String>(milks); // copy
    }

    public double getCost() {
       double baseCost = 0;

       if (type.equalsIgnoreCase("coffee")){
           baseCost = 1;
       } else if ( type.equalsIgnoreCase("espresso")){
           baseCost = 1.5;
       }
       else if ( type.equalsIgnoreCase("tea")){
           baseCost = 2;
       }

       return baseCost + milks.size() * .5;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMilks(ArrayList<String> milks) {
        this.milks = milks;
    }
}
