package org.tnsif.customexception;
//program to demonstrate on custom exception
//to use custom exception extends an exception class(parent)

public class LoginCredentials1 extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	

	public LoginCredentials1(String str) {
		super();
		this.str = str;
	}


	public void LoginCredentials(String str) {
	
		this.str = str;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}
	

	}
	
	


