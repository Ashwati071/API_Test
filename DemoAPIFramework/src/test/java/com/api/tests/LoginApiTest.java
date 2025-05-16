
package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.ConfigUtil;
import com.api.base.UserService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

//import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class LoginApiTest {
	
			@Test(description="Create a user and validate via GET call!")
			public void loginTest() {

		    long id = Long.parseLong(ConfigUtil.getProperty("user.id"));
		    String firstName = ConfigUtil.getProperty("user.firstName");
		    String lastName = ConfigUtil.getProperty("user.lastName");
		    String username = ConfigUtil.getProperty("user.username");
		    String email = ConfigUtil.getProperty("user.email");
		    String password = ConfigUtil.getProperty("user.password");
		    String phone = ConfigUtil.getProperty("user.phone");
		    int userStatus = Integer.parseInt(ConfigUtil.getProperty("user.userStatus"));

		    LoginRequest loginRequest = new LoginRequest(id, username, firstName, lastName, email, password, phone, userStatus);

		    UserService userService = new UserService();

		 // create user
		    Response postResponse = userService.createUser(loginRequest);
		    System.out.println("POST Response body: " + postResponse.getBody().asString());
		    Assert.assertEquals(postResponse.getStatusCode(), 200);

		    // try GET by username
		    System.out.println("GET username: " + username);
		    Response getResponse = userService.getUser(username);
		    System.out.println("GET Response body: " + getResponse.getBody().asString());
		    Assert.assertEquals(getResponse.getStatusCode(), 200);

		}
		       
	}
	

