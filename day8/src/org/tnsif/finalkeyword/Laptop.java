package org.tnsif.finalkeyword;
//program to demonstrate on final method
//parent class
//final class can't be inherit from child class
//public final class Laptop {
public class Laptop {


	final String processor = "intel I5";
	
	//final class
	void display()
	{
		System.out.println(processor);
	}
}
