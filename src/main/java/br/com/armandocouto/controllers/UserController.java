package br.com.armandocouto.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.armandocouto.models.User;

@Path("/users")
public class UserController {
	
	/*
	 * Headers.
	 * Content-Type: application/json
	 * 
	 * JSON exemplo.
	 * 
	 * {"name": "Armando","age":"26"}
	 */
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {
 
		User track = new User();
		track.setName("Armando");
		track.setAge(26);
 
		return Response.status(200).entity(track.toString()).build();
 
	}
	
	@GET
	@Path("/new")
	@Produces(MediaType.APPLICATION_JSON)
	public Response preCreate() {
		
		String result = "New";
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(User track) {
		
		String result = "Track OK : " + track.getName();
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response show(@PathParam("id") int id) {
		
		String result = "ID: " + id;
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/{id}/edit")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(@PathParam("id") int id) {
		
		String result = "ID de edit: " + id;
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") int id, User track) {
		
		String result = "Update : " + track.getName() + ", ID: " + id;
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response destroy(@PathParam("id") int id) {
		
		String result = "ID destroy: " + id;
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	
}