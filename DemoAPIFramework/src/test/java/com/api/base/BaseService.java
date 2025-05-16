package com.api.base;

import static io.restassured.RestAssured.*;

//import com.api.models.request.LoginRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { //Wrapper class for Rest-Assured class
	
	//BASE Uri
	//Creating the request
	//Handling the response
	
    private static final String BASE_URL = ConfigUtil.getProperty("base.url");
	private RequestSpecification reqspec;
	
	public BaseService(){
		
		reqspec=given().baseUri(BASE_URL);
		}
	//POST method
	protected Response postRequest(Object payload,String endpoint) {
		return reqspec.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	//GET method
	protected Response getRequest(String endpoint) {
        return reqspec.get(endpoint);
    }

    // PUT method
    protected Response putRequest(Object payload, String endpoint) {
        return reqspec.contentType(ContentType.JSON).body(payload).put(endpoint);
    }

    // DELETE method
    protected Response deleteRequest(String endpoint) {
        return reqspec.delete(endpoint);
    }
	
	

}
