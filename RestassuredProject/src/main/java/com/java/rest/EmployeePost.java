package com.java.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class EmployeePost {

	
	@Test
	public void postExample()
	{
	/*String myJson ="{\n" +
			 "  \"empNo\": \"100\",\n" +
			 "  \"empName\": \"unna\",\n" +
			 "  \"position\": \"software engineer\"\n" +
			 "}";
			 */
    	RestAssured.baseURI  = "http://localhost:8888";	

    	Response r = given()
    	.contentType("application/json;charset=UTF-8")
    	.body("{\n" +
   			 "  \"empNo\": \"100\",\n" +
   			 "  \"empName\": \"unna\",\n" +
   			 "  \"position\": \"software engineer\"\n" +
   			 "}")
        .when().
        post("/employee");

    	String body = r.getBody().asString();
    	System.out.println(body);

	}
	}