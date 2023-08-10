package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws LoginCredentials1 {
		
		Scanner s = new Scanner(System.in);
		String userid = s.nextLine();
		String passwords = s.nextLine();
		try {
			if(userid.equals("swatithombare2508@gmail.com") &&
					passwords.equals("pass@123"))
			{
				System.out.println("credintials are matched ");
			}
			else
			{
				throw new LoginCredentials1("invalid credentials" );
			}

			}
		catch(LoginCredentials1 e)
		{
			
			System.out.println("Exception handled"+e);
		}

	}
}
