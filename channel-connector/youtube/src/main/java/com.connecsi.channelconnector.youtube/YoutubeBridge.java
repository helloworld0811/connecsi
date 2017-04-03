package com.connecsi.channelconnector.youtube;

/**
 * Created by hku on 03.04.17.
 */

// API KEY: AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8
public class YoutubeBridge {

    //https://www.googleapis.com/youtube/v3/videos?part=statistics&id={Video_ID}&key={YOUR_API_KEY}

    private static String apiUrlPrefix="https://www.googleapis.com/youtube/v3/videos?part=statistics";

    public static String API_KEY="AIzaSyAei1LOM_cbWAJmOqxiwYX-spyPtAa0dW8";

    public static String getYoutubeStatisticById(String videoId){
        String requestUrl=apiUrlPrefix+"&id="+videoId+"&key="+API_KEY;
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
        String response=getYoutubeStatisticById("kffacxfA7G4");
     //com.google.api.services.youtube.model.SearchResult
        System.out.println("response:"+response);
    }
}
