package lk.vikash.rest.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Path("/test")
public class TestController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String  test(){
        return "Hello TestController";
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String postRequest(String input){
        System.out.println("ok");

        Gson gson = new Gson();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Kamal");

        return gson.toJson(jsonObject);
    }
    @Path("/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String putRequest(@PathParam("id") int id, @Context HttpServletRequest request){
        System.out.println(id);
        Gson gson = new Gson();

        request.getSession();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status",true);
        return gson.toJson(jsonObject);

    }

}
