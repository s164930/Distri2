package com.dtuservices;

import jacobLogin.Brugeradmin;
import jacobLogin.BrugeradminImplServiceLocator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jacoblogin")
public class LoginJacobServer {

    @GET
    @Path("/{userId}&{pass}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@PathParam("userId") String userId, @PathParam("pass") String pass){
        BrugeradminImplServiceLocator locator = new BrugeradminImplServiceLocator();
        try {
            Brugeradmin service = locator.getBrugeradminImplPort();
            return service.hentBruger(userId, pass).getBrugernavn();
        } catch (Exception e) {
            e.printStackTrace();
            return "Forkert Brugernavn eller adgangskode";
        }
    }
}
