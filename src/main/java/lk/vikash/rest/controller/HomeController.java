package lk.vikash.rest.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HomeController {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable index(){

            return new Viewable("/index");
        }
        @Path("/home")
         @GET
        @Produces(MediaType.TEXT_HTML)
        public Viewable home(){
            return new Viewable("/index");
        }

    }

