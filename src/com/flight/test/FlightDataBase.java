package com.flight.test;

import java.util.ArrayList;

public class FlightDataBase {

    ArrayList<Flight> newListFlight = new ArrayList<Flight>();

    public FlightDataBase(){
        this.newListFlight.add(new Flight("Kraków", "Warszawa"));
        this.newListFlight.add(new Flight("Wrocław", "Lublin"));
        this.newListFlight.add(new Flight("Katowice", "Rzeszów"));
        this.newListFlight.add(new Flight("Lublin", "Warszawa"));
        this.newListFlight.add(new Flight("Warszawa", "Gdańsk"));
        this.newListFlight.add(new Flight("Gdańsk", "Lublin"));

    }

    public void checkIfFlightExists(String start, String stop){
        for (int i = 0; i<this.newListFlight.size(); i++){
            Flight flight = this.newListFlight.get(i);
            if (start.equals(flight.deaprture)) && stop.equals(flight.arrival)){
                System.out.println("Flight exists.");
                return;
            }
            System.out.println("Flight not exists");
        }
    }
}
