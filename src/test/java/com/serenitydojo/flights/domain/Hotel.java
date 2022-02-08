package com.serenitydojo.flights.domain;

public class Hotel {
    private final String name;
    private final int stars;

    public Hotel(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                '}';
    }
}
