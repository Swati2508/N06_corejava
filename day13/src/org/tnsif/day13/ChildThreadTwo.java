package org.tnsif.day13;


public class ChildThreadTwo extends Thread{
	public void run()
	{
		System.out.println(" is 5 Prime number? "+Operations.isPrime(5));
	}
}