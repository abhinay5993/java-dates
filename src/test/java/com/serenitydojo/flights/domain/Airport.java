package com.serenitydojo.flights.domain;

public abstract class Airport {
    private final String name;
    private final String code;
    private final String country;

    public Airport(String name, String code, String country) {
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

    public abstract boolean canFlyOverseas();
}
