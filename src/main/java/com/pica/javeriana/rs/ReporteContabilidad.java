package com.pica.javeriana.rs;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.pica.javeriana.response.StringList;


@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface ReporteContabilidad {
	
	@GET
	@Path("/pago/{fecha}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})	
	public StringList reportePago(@PathParam("fecha") String fecha);

}
