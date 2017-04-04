package com.connecsi.channelconnector.youtube;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.model.ChannelListResponse;
import com.google.api.services.youtube.model.VideoListResponse;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by hku on 03.04.17.
 */

public class YoutubeBridge {

    //https://www.googleapis.com/youtube/v3/videos?part=statistics&id=kffacxfA7G4&key=AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8

    // https://www.googleapis.com/youtube/v3/channels?part=statistics&id=SWMb9NxQL9I6c&key=AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8

    public static final JsonFactory JSON_FACTORY = new JacksonFactory();

    public  String getYoutubeChannelStatisticById(String channelId) {
        String requestUrl = YoutubeConstants.API_CHANNEL_STATS_URL_PRIFIX + "&id=" + channelId + "&key=" + YoutubeConstants.API_KEY;
        try {

            String json = readJsonFromUrl(requestUrl);

            System.out.println(json.toString());
        } catch (Exception e) {

        }
        return requestUrl;
    }


    public  String getYoutubeChannelIdByUserName(String userName) {
        String requestUrl = YoutubeConstants.API_CHANNEL_ID_URL_PRIFIX + "?key=" + YoutubeConstants.API_KEY+ "&forUsername="+userName+"&part=id";
       String channelId=null;
        try {

            String json = readJsonFromUrl(requestUrl);
            System.out.println(json.toString());
            ChannelListResponse channelListResponse = convertJSONToChannelListResponse(json);
            if(channelListResponse!=null && channelListResponse.getItems()!=null && !channelListResponse.getItems().isEmpty())
            {

                channelId=channelListResponse.getItems().get(0).getId();
                System.out.println("id"+channelId);
            }

        } catch (Exception e) {

        }
        return channelId;
    }


    public  String getChannelStatistics(String userName)
    {
        String channelId=getYoutubeChannelIdByUserName(userName);
        String channelStatistics=getYoutubeChannelStatisticById(channelId);
        System.out.println(channelStatistics);
        return channelStatistics;
    }


    private  String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public  String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);

            return jsonText;
        } finally {
            is.close();
        }
    }


    private  ChannelListResponse  convertJSONToChannelListResponse(String jsonString)
    {

        ChannelListResponse channelListResponse=null;
        try {
            channelListResponse=JSON_FACTORY.fromString(jsonString,ChannelListResponse.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return channelListResponse;
    }
}
