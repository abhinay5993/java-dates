package com.serenitydojo.flights.domain;

import java.util.List;
import java.util.stream.Collectors;

public interface HasHotels {
    List<Hotel> findHotels();

    default List<Hotel> findHotelsByStars(int numberOfStars) {
        return findHotels().stream().filter(hotel -> hotel.getStars() == numberOfStars).collect(Collectors.toList());
    }
}
