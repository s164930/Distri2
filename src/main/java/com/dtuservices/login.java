package com.dtuservices;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static com.utilities.VariousUtilities.AppName;
import static com.utilities.VariousUtilities.AppToken;

@Path("/login")
public class login {
    @GET
    @Path("/{userId}&{userPass}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getToken(@PathParam("userId") String userId, @PathParam("userPass") String userPass){
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String response = "";
        HttpPost request = new HttpPost("https://auth.dtu.dk/dtu/mobilapp.jsp");
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);
        List<NameValuePair> pairs = new ArrayList<NameValuePair>();
        pairs.add(new BasicNameValuePair("username", userId));
        pairs.add(new BasicNameValuePair("password", userPass));

        try {
            request.setEntity(new UrlEncodedFormEntity(pairs));
            HttpResponse answer = client.execute(request);
            response += "Response Code: " + answer.getStatusLine().getStatusCode() + "\n";
            BufferedReader br = new BufferedReader(new InputStreamReader(answer.getEntity().getContent()));
            String line = "";
            while((line = br.readLine()) != null){
                response += line;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }
}
