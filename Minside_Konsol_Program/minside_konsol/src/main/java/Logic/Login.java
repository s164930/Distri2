package Logic;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private static String AppName = "MInside";
    private static String AppToken = "f7869fb6-41a8-4300-bd62-203c9f1a1225";

    public String loginOnDtu(String user, String pass){
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String response = "";
        HttpPost request = new HttpPost("https://auth.dtu.dk/dtu/mobilapp.jsp");
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);
        List<NameValuePair> pairs = new ArrayList<NameValuePair>();
        pairs.add(new BasicNameValuePair("username", user));
        pairs.add(new BasicNameValuePair("password", pass));

        try {
            request.setEntity(new UrlEncodedFormEntity(pairs));
            HttpResponse answer = client.execute(request);
            response += "Response Code: " + answer.getStatusLine().getStatusCode() + "\n";
            BufferedReader br = new BufferedReader(new InputStreamReader(answer.getEntity().getContent()));
            String line = "";
            while((line = br.readLine()) != null){
                response += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(response.contains("Password")){
            return response;
        } else{
            return "false";
        }
    }
}
