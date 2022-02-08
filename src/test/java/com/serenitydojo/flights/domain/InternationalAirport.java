package com.serenitydojo.flights.domain;

import java.util.List;

public class InternationalAirport extends Airport
        implements CanFlyOverseas, HasHotels {
    private final List<String> servicedCountries;
    private final List<Hotel> hotels;

    public InternationalAirport(String name,
                                String code,
                                String country,
                                List<String> servicedCountries,
                                List<Hotel> hotels) {
        super(name, code, country);
        this.servicedCountries = servicedCountries;
        this.hotels = hotels;
    }

    @Override
    public boolean canFlyOverseas() {
        return false;
    }

    @Override
    public List<String> getServicedCountries() {
        return servicedCountries;
    }

    @Override
    public List<Hotel> findHotels() {
        return hotels;
    }
}
