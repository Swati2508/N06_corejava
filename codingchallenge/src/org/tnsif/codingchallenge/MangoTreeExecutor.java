/* Darshan is so much interested in gardening & hence he plants 
 * more trees in his garden.
 * He plants trees in a rectangular fashion with the order of rows & columns
 * & numbers the trees in a row-wise order.
 * He planted the mango tree in the 1st-row 1st-column and last column.
 * So given the tree(t) number, row(n) and column(n) number as input
 * Your task is to find out whether a mango tree(t) or not?
 * n=5, t=11.
 */
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n )
			System.out.println("mango tree");
		else
			System.out.println("not a mango tree");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n and t :");
		int n = s.nextInt();
		int t = s.nextInt();
		isMangoTree(n,t);
		

	}

}
