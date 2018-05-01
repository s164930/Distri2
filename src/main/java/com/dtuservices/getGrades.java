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

@Path("/getgrades")
public class getGrades {

    @GET
    @Path("/{userId}&{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getIt(@PathParam("userId") String userId, @PathParam("token") String token){
        VariousUtilities util = new VariousUtilities();
        String authString = util.encodeUserandToken(userId, token);
        HttpGet request = new HttpGet("https://cn.inside.dtu.dk/data/CurrentUser/Grades");
        request.addHeader("Authorization", "Basic " + authString);
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);
        return util.getUseHttpRequest(request);
    }
}
