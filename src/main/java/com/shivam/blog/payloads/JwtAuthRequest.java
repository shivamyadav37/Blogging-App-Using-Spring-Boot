package com.shivam.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

	private String username;
	
	private String password;

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
