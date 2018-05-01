package com.utilities;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VariousUtilities {
    public static String AppName = "MInside";
    public static String AppToken = "f7869fb6-41a8-4300-bd62-203c9f1a1225";

    public String encodeUserandToken(String userId, String tokenId){
        String reciToken = userId + ":" + tokenId;
        byte[] authToken = Base64.encodeBase64(reciToken.getBytes());
        return new String(authToken);
    }

    public Object getUseHttpRequest(HttpGet request){
        int indentFactor = 4;
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String statusCode = "";
        String response = "";
        try {
            HttpResponse answer = client.execute(request);
            statusCode += "Response Code: " + answer.getStatusLine().getStatusCode() + "\n";
            BufferedReader br = new BufferedReader(new InputStreamReader(answer.getEntity().getContent()));
            String line = "";
            while((line = br.readLine()) != null){
                response += line;
            }
            JSONObject xmlJson = XML.toJSONObject(response);
            String returnvalue = xmlJson.toString(indentFactor);
            return returnvalue;
        } catch (Exception e) {
            e.printStackTrace();
            return statusCode;
        }
    }


}
