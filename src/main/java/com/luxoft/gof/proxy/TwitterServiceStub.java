package com.luxoft.gof.proxy;

/**
 * Created by msokolov on 9/10/2015.
 */
public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("Sending new post");
    }
}
