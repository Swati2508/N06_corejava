//program to demonstrate on array using run-time input values and to find 
//largest element in an array

package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the toatal no of array elements ");
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
			
		}
		int max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[1]>max)
			{
				max=arr[1];
				
			}
		}
		System.out.println("largest element is : "+max);
		Arrays.sort(arr);;
		System.out.println("sorted elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		
		

	}

}
