package com.java.rest;




import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EmployeeDelete {

	
	@Test
	public void Delete()
	{
	
    	RestAssured.baseURI  = "http://localhost:8888";	

    	Response r = given()
    	.contentType("application/json;charset=UTF-8")
    	.body("{\n" +
   			 "  \"empNo\": \"100\",\n" +
   			 "  \"empName\": \"unna\",\n" +
   			 "  \"position\": \"software engineer\"\n" +
   			 "}")
        .when().
      delete("/employee/1019");

    	String body = r.getBody().asString();
    	System.out.println(body);

	}
	}
