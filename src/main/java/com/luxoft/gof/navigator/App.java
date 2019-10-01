package com.luxoft.gof.navigator;


/**
 * Created by msokolov on 5/5/2016.
 */
public class App {
    public static void main(String[] args) {
        Station station1 = new Station("1");
        Station station2 = new Station("2");
        Station station3 = new Station("3");
        Station station4 = new Station("4");
        Route route = Route.stations(station1, station2, station3, station4);
        RoadMap map = new RoadMap();
        map.register(station1, new GeoPoint());
        map.register(station2, new GeoPoint());
        map.register(station3, new GeoPoint());
        map.register(station4, new GeoPoint());
        new Vehicle("v1", map, route).go();
        new Vehicle("v2", map, route).go();

    }


}
