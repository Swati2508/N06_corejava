//program to demonstrate to final variable
package org.tnsif.finalkeyword;
public class FinalVariable {
	
	// final variable must be initialize during declaration
	// final int x;
	
	final float SALARY = 67000.78f;
	
	void print()
	{
		// we cant change the value of final variable
		// SALARY = 89000.76f;
		System.out.println("Salary is: "+SALARY);
		
	}
	
	

}
