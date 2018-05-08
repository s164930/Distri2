package Logic;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetInfo {

    private String getResponse(HttpGet request){
        CloseableHttpClient client = HttpClientBuilder.create().build();
        String statusCode = "";
        String response = "";
        try{
            HttpResponse answer = client.execute(request);
            statusCode += "Response code:" + answer.getStatusLine().getStatusCode() + "\n";
            BufferedReader br = new BufferedReader(new InputStreamReader(answer.getEntity().getContent()));
            String line = "";
            while((line = br.readLine()) != null){
                response += line;
            }
            return response;
        } catch(Exception e){
            e.printStackTrace();
            return statusCode;
        }
    }

    public String getUserInfo(String user, String token){
        HttpGet request = new HttpGet("https://cn-minside.com/getuserinfo/" + user + "&" + token);
        String response = getResponse(request);
        JSONObject json = new JSONObject(response);
        String returnValue = "";
        returnValue += "Brugernavn: " + json.getJSONObject("User").getString("UserName") + "\n";
        returnValue += "Navn: " + json.getJSONObject("User").getString("GivenName") + " " + json.getJSONObject("User").getString("FamilyName") + "\n";
        returnValue += "Email: " + json.getJSONObject("User").getString("Email") + "\n";
        returnValue += "UserId: " + json.getJSONObject("User").get("UserId") + "\n";
        returnValue += "Telefon Nummer: " + json.getJSONObject("User").get("PrimaryPhone") + "\n";
        return returnValue;
    }

    public String getCalendar(String user, String token, String from, String to){
        HttpGet request = new HttpGet("https://cn-minside.com/getcalendar/" + user + "&" + token + "/" + from + "/" + to);
        String response = getResponse(request);
        JSONArray json = new JSONObject(response).getJSONObject("feed").getJSONArray("entry");
        String returnValue = "";
        for (int i = 0; i<json.length(); i++) {
            returnValue += "Navn: " + json.getJSONObject(i).getJSONArray("cn:element").getJSONObject(0).getString("cn:name") + "\n";
            returnValue += "Starter: " + json.getJSONObject(i).getJSONObject("cn:duration").getString("StartTime").substring(11) + "\n";
            returnValue += "Slutter: " + json.getJSONObject(i).getJSONObject("cn:duration").getString("EndTime").substring(11) + "\n";
            returnValue += "\n";
        }
        return returnValue;
    }

    public String getGrades(String user, String token){
        HttpGet request = new HttpGet("https://cn-minside.com/getgrades/" + user + "&" + token);
        String response = getResponse(request);
        String returnValue = "";
        JSONArray json = new JSONObject(response).getJSONObject("EducationProgrammes").getJSONObject("EducationProgramme").getJSONObject("ExamResults").getJSONArray("ExamResult");
        for(int i = 0; i < json.length(); i++){
            returnValue += "Kursus: " + json.getJSONObject(i).getString("Name") + "\n";
            returnValue += "Karakter: " + json.getJSONObject(i).get("Grade") + "\n";
            returnValue += "\n";
        }
        return returnValue;
    }

    public String loginOnJavabog(String user, String pass){
        HttpGet request = new HttpGet("https://cn-minside.com/jacoblogin/" + user + "&" + pass);
        String response = getResponse(request);
        if(response.contains("Forkert")){
            return "Forkert brugernavn eller adgangskode, prøv igen";
        } else {
            return "Du har nu logget ind på javabog.dk, tillykke";
        }
    }
}
