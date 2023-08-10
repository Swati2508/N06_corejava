package org.tnsif.singledimensionalarray;
//program to demonstrate on 1D array using compile time input
public class ArrayExample {

	public static void main(String[] args) {
		
		int arr[] = {66,33,21,6,1};
		//array initialization at the compile time
		System.out.println(arr[1]);
		System.out.println("array element are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}

	}

}
