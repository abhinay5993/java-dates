package com.serenitydojo.flights.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalAirport extends Airport implements HasHotels{
    private final List<Hotel> hotels;

    public RegionalAirport(String name, String code, String country, List<Hotel> hotels) {
        super(name, code, country);
        this.hotels = hotels;
    }

    @Override
    public boolean canFlyOverseas() {
        return false;
    }

    @Override
    public List<Hotel> findHotels() {
        return hotels;
    }
}
