package com.connecsi.channelconnector.youtube;

import org.junit.Test;

/**
 * Created by hku on 04.04.17.
 */
public class YoutubeBridgeTest {

    @Test
    public void testGetChannelStatistics()
    {
        YoutubeBridge yb=new YoutubeBridge();
        String resource=yb.getChannelStatistics("VenetianPrincess");
        System.out.println(resource);
    }
}
