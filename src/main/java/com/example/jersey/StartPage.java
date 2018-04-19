package com.example.jersey;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Path("/start")
public class StartPage {
    public static String AppName = "MInside";
    public static String AppToken = "f7869fb6-41a8-4300-bd62-203c9f1a1225";
    @GET
    @Path("/{userId}:{tokenId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(@PathParam("userId") String userId, @PathParam("tokenId") String tokenId) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String response = "";
        System.out.println(userId + "\n" + tokenId);
        HttpGet request = new HttpGet("https://cn.inside.dtu.dk/data/CurrentUser/UserInfo");
        request.addHeader("Authorization", userId + ":" + tokenId);
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);

        try {
            HttpResponse answer = client.execute(request);
            response += "Response Code: " + answer.getStatusLine().getStatusCode() + "\n";
            BufferedReader br = new BufferedReader(new InputStreamReader(answer.getEntity().getContent()));
            String line = "";
            while((line = br.readLine()) != null){
                response += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        try {
            URL url = new URL("https://www.campusnet.dtu.dk/data/CurrentUser/UserInfo");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.addRequestProperty("Authorization", "Basic " + id);
            conn.addRequestProperty("X-appname", AppName);
            conn.addRequestProperty("X-token", AppToken);

            if(conn.getResponseCode() != 200){
                throw new RuntimeException("Failed: HTTP error code :" + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String output;
            response += "The output from the server is : \n";
            while((output = br.readLine())!= null){
                response += output;
            }

            conn.disconnect();


        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        return response;

    }
}