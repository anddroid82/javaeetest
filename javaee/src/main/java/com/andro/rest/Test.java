package com.andro.rest;

import java.time.LocalDate;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.andro.entity.Car;
import com.andro.entity.Fuel;
import com.andro.service.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Path("/test")
public class Test {
	
	//HIBA
	@Inject
	private Service service;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
    	Car c = new Car(1L, "Ford", "Focus", Fuel.BENZIN, LocalDate.now().getYear());
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String json = "";
		try {
			json = ow.writeValueAsString(c);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return json;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greet/{name}")
    public String greeting(@PathParam("name") String name) {
    	return "Hello "+name+"!";
    }
    
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addCar(Car car) {
    	
    	return car.toString();
    }
    
    @GET
    @Path("/allcar")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllCar() {
    	//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		//EntityManager entityManager = entityManagerFactory.createEntityManager();
    	return this.service.getService();
    }
}


