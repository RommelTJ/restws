package com.rommelrico.trainings.jaxrs;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Produces({"application/xml", "application/json"})
public interface PatientService {

	@GET
	@Path("/patients/{id}")
	Patient getPatient(@PathParam("id") String id);

	@PUT
	@Path("/patients/")
	Response updatePatient(Patient patient);

	@POST
	@Path("/patients/")
	Response addPatient(Patient patient);

	@DELETE
	@Path("/patients/{id}")
	Response deletePatients(@PathParam("id") String id);

	Prescription getPrescription(String prescriptionId);

}