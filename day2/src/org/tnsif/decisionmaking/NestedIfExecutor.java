package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age and weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("eligible for bunjee jumping");
				if(weight>110)
				{
					System.out.println("extra ropes will be added");
				}
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("you are not eligible");
		}
		
	}

}