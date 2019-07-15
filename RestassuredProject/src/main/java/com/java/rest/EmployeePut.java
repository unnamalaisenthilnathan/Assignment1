package com.java.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EmployeePut {

	
	@Test
	public void putmethod()
	{
	
    	RestAssured.baseURI  = "http://localhost:8888";	

    	Response r = given()
    	.contentType("application/json;charset=UTF-8")
    	.body("{\n" +
   			 "  \"empNo\": \"100\",\n" +
   			 "  \"empName\": \"unnasenthil\",\n" +
   			 "  \"position\": \"software engineer\"\n" +
   			 "}")
        .when().
        put("/employee");

    	String body = r.getBody().asString();
    	System.out.println(body);

	}
	}