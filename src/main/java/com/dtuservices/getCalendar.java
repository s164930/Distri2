package com.dtuservices;

import com.utilities.VariousUtilities;
import org.apache.http.client.methods.HttpGet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static com.utilities.VariousUtilities.AppName;
import static com.utilities.VariousUtilities.AppToken;

@Path("/getcalendar")
public class getCalendar {

    @GET
    @Path("/{userId}&{token}/{from}/{to}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getIt(@PathParam("userId") String userId, @PathParam("token") String token,@PathParam("from") String from, @PathParam("to") String to){
        VariousUtilities util = new VariousUtilities();
        String authString = util.encodeUserandToken(userId, token);
        HttpGet request = new HttpGet("https://cn.inside.dtu.dk/data/CurrentUser/Calendar/" + from + "/To/" + to);
        request.addHeader("Authorization", "Basic " + authString);
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);
        String statusCode = "";
        return util.getUseHttpRequest(request);
    }
}
