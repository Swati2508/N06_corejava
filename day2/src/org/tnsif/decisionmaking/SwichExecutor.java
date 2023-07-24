package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwichExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the song no :");
		int songno=s.nextInt();
	
		switch(songno)
		{
		case 1:
			System.out.println("waka waka");
			break;
		case 2:
			System.out.println("taki taki");
			break;
		case 3:
			System.out.println("jai shree ram");
			break;
		default :
			System.out.println("inavlid choice");
		}
		
	}

}
