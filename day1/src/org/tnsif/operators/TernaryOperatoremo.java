//program for demonstrate the Ternary Operator
package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatoremo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result = (num%2==0)?"Even":"odd";
		System.out.println("Result is: "+result);
		
		

	}

}
