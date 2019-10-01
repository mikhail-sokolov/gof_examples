package com.luxoft.gof.navigator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msokolov on 5/5/2016.
 */
public class RoadMap {
    private Map<Station, GeoPoint> stationsOnMap;
    private Map<Vehicle, GeoPoint> vehicleOnMap;

    public RoadMap() {
        this.stationsOnMap = new HashMap<>();
        this.vehicleOnMap = new HashMap<>();
    }

    public void register(Station station, GeoPoint point) {
        stationsOnMap.put(station, point);
    }

    public void register(Vehicle vehicle) {
        vehicleOnMap.put(vehicle, new GeoPoint());
    }

    public void navigateTo(Station station, Vehicle vehicle) {
        GeoPoint stationLocation = stationsOnMap.get(station);
        vehicleOnMap.put(vehicle, stationLocation);
        if (isReached(station, stationLocation)) {
            vehicle.arrived();
        }
    }

    private boolean isReached(Station station, GeoPoint geoPoint) {
        GeoPoint stationLocation = stationsOnMap.get(station);
        return stationLocation.equals(geoPoint);
    }
}
