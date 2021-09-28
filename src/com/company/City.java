package com.company;

import java.util.List;

public class City {
    private String name;
    private String state;
    private List edges;
    private float latitude;
    private float longitude;

    public City(String name, String state, float lat, float log){
        this.name = name;
        this.state = state;
        this.latitude = lat;
        this.longitude = log;
    }

}
