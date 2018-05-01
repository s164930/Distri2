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


@Path("/getuserinfo")
public class getUserInfo {

    @GET
    @Path("/{userId}&{tokenId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getIt(@PathParam("userId") String userId, @PathParam("tokenId") String tokenId) {
        VariousUtilities util = new VariousUtilities();
        String authString = util.encodeUserandToken(userId, tokenId);
        HttpGet request = new HttpGet("https://cn.inside.dtu.dk/data/CurrentUser/UserInfo");
        request.addHeader("Authorization", "Basic " + authString);
        request.addHeader("X-appname", AppName);
        request.addHeader("X-token", AppToken);
        return util.getUseHttpRequest(request);
    }
}