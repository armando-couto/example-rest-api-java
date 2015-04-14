package br.com.armandocouto.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.armandocouto.models.Track;

@Path("/")
public class CrunchifyRESTService {
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response student(Track track) {
		
		String result = "Track saved : " + track;
		
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTrackInJSON() {
 
		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
 
		return Response.status(200).entity(track.toString()).build();
 
	}
}