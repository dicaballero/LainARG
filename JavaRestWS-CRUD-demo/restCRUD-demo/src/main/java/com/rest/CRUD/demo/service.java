
package com.rest.CRUD.demo;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("service")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class service {
    
 
 @POST
 @Path("create/{s}/{l}/{i}/{d}")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Object createService(@PathParam("s")String s,@PathParam("l")Long l,@PathParam("i")int i,@PathParam("d")double d){
     repository r = new repository();
     return r.createDb(s, l, i, d);    
}      
 
 @GET
 @Path("/read/{l}")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Object readService(@PathParam("l")Long l){
     repository r = new repository();
     return r.readDb(l);
 }

 @PUT
 @Path("/update/{su}/{lu}/{iu}/{du}")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Object updateService(@PathParam("su")String s,@PathParam("lu")Long l,@PathParam("iu")int i,@PathParam("du")double d){
     repository r = new repository();
     return r.updateDb(s,l,i,d);
 }
 
 @DELETE
 @Path("/delete/{l}")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Object deleteService(@PathParam("l")Long l){
     repository r = new repository();
     return r.deleteDb(l);
 }
 
 @GET
 @Path("getRepo")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public String getRepoService(){
     return repository.getRepository();
 }
 
 @DELETE
 @Path("clearRepo")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public String clearRepoService(){
    return repository.clearRepository();
 }
 
 
}
