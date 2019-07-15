package com.java.rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Employee {

@Test
void getEmployee(){

 RestAssured.baseURI="http://localhost:8888/employees";
 

 RequestSpecification httpRequest=RestAssured.given();
 
 
 Response response=httpRequest.request(Method.GET);
 

 
 String responseBody=response.getBody().asString();
 System.out.println("Response body is:"+responseBody);

 int statusCode=response.getStatusCode();
 System.out.println("Status code is:"+statusCode);
 Assert.assertEquals(statusCode, 200);
}
}