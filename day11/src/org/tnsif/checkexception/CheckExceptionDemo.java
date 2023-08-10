package org.tnsif.checkexception;
import java.io.FileInputStream;
public class CheckExceptionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			
			@SuppressWarnings("unused")
			FileInputStream f = new FileInputStream("C:\\Users\\Swati\\OneDrive\\Desktop");
			System.out.println("file is exist");
			}
		catch(Exception e)
			{
				System.out.println("Exception handled: "+e);
			}
		
		
		
	}

}
