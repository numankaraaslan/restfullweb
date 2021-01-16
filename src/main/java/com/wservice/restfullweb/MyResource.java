package com.wservice.restfullweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myresource")
public class MyResource
{
	@GET
	@Path("/hi")
	//http://localhost:8080/restfullweb/myresource/hi
	public String getIt()
	{
		return "Hi there!";
	}
}
