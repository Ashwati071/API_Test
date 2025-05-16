package com.api.models.response;

public class LoginResponse {
	
	private String code;
	private String type;
	private String message;
	
	public LoginResponse(String code, String type, String message) {
		super();
		this.code = code;
		this.type = type;
		this.message = message;
	}
	
	public LoginResponse() {
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginResponse [code=" + code + ", type=" + type + ", message=" + message + "]";
	}
	
	
}
