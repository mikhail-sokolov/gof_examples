package com.luxoft.gof.navigator;

import java.util.Objects;

/**
 * Created by msokolov on 5/5/2016.
 */
public class Vehicle {
    private final String id;
    private RoadMap map;
    private Station nextStation;
    private Route route;

    public Vehicle(String id, RoadMap map, Route route) {
        this.id = Objects.requireNonNull(id);
        this.map = map;
        this.map.register(this);
        this.route = route;
        this.nextStation = this.route.register(this);
    }

    public void go() {
        if (nextStation != null) {
            System.out.println("Next station is:" + nextStation);
            map.navigateTo(nextStation, this);
        }
    }

    public void arrived() {
        System.out.println("I'm here: " + nextStation);
        this.nextStation = route.nextStation(this);
        go();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return id.equals(vehicle.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
