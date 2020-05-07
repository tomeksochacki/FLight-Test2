package com.flight.test;

public class Flight {
    private String deperture;
    private String arrival;

    public Flight(String deperture, String arrival){
        this.deperture = deperture;
        this.arrival = arrival;

    }

    public void getInfoFlightFromTo(){
        System.out.println("Flight from: " + this.deperture + ", Flight to: " + this.arrival);
    }
}
