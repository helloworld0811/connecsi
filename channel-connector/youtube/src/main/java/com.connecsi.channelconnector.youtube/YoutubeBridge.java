package com.connecsi.channelconnector.youtube;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by hku on 03.04.17.
 */

// API KEY: AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8
public class YoutubeBridge {

    //https://www.googleapis.com/youtube/v3/videos?part=statistics&id=kffacxfA7G4&key=AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8

    private static String apiUrlPrefix = "https://www.googleapis.com/youtube/v3/videos?part=statistics";

    public static String API_KEY = "AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8";

    public static String getYoutubeStatisticById(String videoId) {
        String requestUrl = apiUrlPrefix + "&id=" + videoId + "&key=" + API_KEY;
        try {

            String json = readJsonFromUrl(requestUrl);
            System.out.println(json.toString());
        } catch (Exception e) {

        }
        return requestUrl;
    }

    public static void main(String[] args) {

        /*YouTube.Videos.List list;
        list = youtube.videos().list("statistics");
        list.setId("kffacxfA7G4");
        list.setKey(API_KEY);
        Video v = list.execute().getItems().get(0);
        System.out.println("The view count is: "+v.getStatistics().getViewCount());

*/
        String response = getYoutubeStatisticById("kffacxfA7G4");
        //com.google.api.services.youtube.model.SearchResult
        System.out.println("response:" + response);
    }


    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            //JSONObject json = new JSONObject(jsonText);
            return jsonText;
        } finally {
            is.close();
        }
    }
}
