package com.luxoft.gof.proxy;

/**
 * Created by msokolov on 9/10/2015.
 */
public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
