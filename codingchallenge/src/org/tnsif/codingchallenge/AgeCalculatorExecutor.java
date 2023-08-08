/* ask a user for their birth year encoded as 2 digits (like "02")
 * and for the current year also encoded as 2 digits (like "23").
 * write a program to find the users current age in years
 */
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class AgeCalculatorExecutor {
	
	static void agecalculator(int by, int cy)
	{
		if(cy>by)
			System.out.println(cy=by);
		else
			System.out.println((100-by)+cy);
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the birth year and current year :");
		int by = s.nextInt();
		int cy = s.nextInt();
		agecalculator(by,cy);
		
	}

}
