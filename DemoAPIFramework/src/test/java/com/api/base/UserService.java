package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class UserService extends BaseService{
	
    private static final String USER_ENDPOINT  = "/user";
	
    public Response createUser(LoginRequest payload) {
    	return postRequest(payload,USER_ENDPOINT );
    }
    
    public Response getUser(String username) {
    	return getRequest(USER_ENDPOINT + "/" + username);
    }
    
    

}
