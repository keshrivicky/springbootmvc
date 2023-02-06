package com.user.exception;

public class UserNotFoundException extends Exception {
	
	String msg;
	
	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserNotFoundException(String msg){
		super(msg);
		this.msg= msg;
	}

}
