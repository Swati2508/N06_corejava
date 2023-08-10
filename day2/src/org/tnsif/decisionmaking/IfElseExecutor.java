/*program to demonstrate on to check the person is eligible to donate
 * the blood or not using  */
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50) 
		{
			System.out.println("Eligible to donatenthe blood");
		}
		
	}

}
