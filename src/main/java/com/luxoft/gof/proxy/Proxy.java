package com.luxoft.gof.proxy;

/**
 * Created by Teacher1316 on 6/6/2018.
 */
public class Proxy implements TwitterService {
    private TwitterService object;

    public Proxy(TwitterService object) {
        this.object = object;
    }

    @Override
    public String getTimeline(String screenName) {
        return object.getTimeline(screenName);
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        throw new RuntimeException();
    }
}
