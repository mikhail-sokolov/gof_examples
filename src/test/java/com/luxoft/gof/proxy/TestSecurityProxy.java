package com.luxoft.gof.proxy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by msokolov on 9/10/2015.
 */
public class TestSecurityProxy {
    @Test
    public void creatingProxyOfStubAndCallingGetTimelineMethod() throws Exception {
        TwitterService twitterService = SecurityProxy.newInstance(new TwitterServiceStub());
        assertThat(twitterService.getTimeline("proxy")).isEqualTo("My timeline");

    }

    @Test(expected = RuntimeException.class)
    public void postMessageShouldBeProhibited() throws Exception {
        TwitterService twitterService = SecurityProxy.newInstance(
                new TwitterServiceStub()
        );
        twitterService.postToTimeline("proxy", "Some message that shouldn't go through");
    }
}
