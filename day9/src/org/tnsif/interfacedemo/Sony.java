package org.tnsif.interfacedemo;

public interface Sony {
	
	//by default all the variables inside an interface is public static final
	int noOfChannels=6;
	//by default all the method inside an interface is an abstract method
	void display();
	/*java 8 provide a static and defalt method inside an interface*/
	//static method
	static void accept()
	{
		System.out.println("static method");
	}
	default void show()
	{
		System.out.println("default method");
		
	}

}
