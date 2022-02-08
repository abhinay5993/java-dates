package com.serenitydojo.flights;

import com.serenitydojo.flights.domain.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WhenBookingFlights {

    List<Hotel> londonHotels = Arrays.asList(new Hotel("Hilton", 5), new Hotel("Holiday Inn", 3));
    List<Hotel> barcelonHotels = Arrays.asList(new Hotel("Hilton", 5), new Hotel("Double Tree", 4));
    List<Hotel> halifaxHotels = Arrays.asList(new Hotel("Holiday Inn", 3));

    @Test
    void shouldHaveAListOfServicedAirports() {
        Airport heathrow = new InternationalAirport("Heathrow", "LHR", "United Kingdom", Arrays.asList("France", "Spain", "USA", "Canada"), londonHotels);
        Airport barcelona = new InternationalAirport("Barcelona", "BCN", "Spain", Arrays.asList("UK", "France", "Italy"), barcelonHotels);
        Airport halifax = new RegionalAirport("Halifax", "YHZ", "Canada", halifaxHotels);

        List<Airport> airports = Arrays.asList(halifax, barcelona, heathrow);

        for (Airport airport : airports) {
            System.out.println("AIRPORT CODE: " + airport.getCode());
            if (airport instanceof HasHotels) {
                HasHotels airportWithHotels = (HasHotels) airport;
                System.out.println("5 star hotels: " + airportWithHotels.findHotelsByStars(5));
            }
        }
    }


}
