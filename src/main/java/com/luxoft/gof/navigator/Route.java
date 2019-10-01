package com.luxoft.gof.navigator;

import java.util.*;

/**
 * Created by msokolov on 5/5/2016.
 */
public class Route {
    private List<Station> stations;
    private Map<Vehicle, Iterator<Station>> vehiclesOnRoute;

    public Route(Station[] stations) {
        this.stations = Arrays.asList(stations);
        this.vehiclesOnRoute = new HashMap<>();
    }

    public static Route stations(Station... stations) {
        return new Route(stations);
    }

    public Station register(Vehicle vehicle) {
        Iterator<Station> stationIterator = stations.iterator();
        if (stationIterator.hasNext()) {
            vehiclesOnRoute.put(vehicle, stationIterator);
            return stationIterator.next();
        } else {
            return null;
        }
    }

    public Station nextStation(Vehicle vehicle) {
        Iterator<Station> stationIterator = vehiclesOnRoute.get(vehicle);
        if (stationIterator.hasNext()) {
            return stationIterator.next();
        } else {
            return null;
        }
    }
}
