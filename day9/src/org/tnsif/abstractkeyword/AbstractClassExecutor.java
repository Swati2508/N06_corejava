package org.tnsif.abstractkeyword;
//driver class
//program to demonstrate on abstract keyword
public class AbstractClassExecutor {

	public static void main(String[] args) {
//		we can't create the object for abstract class
//		Sandwich s= new Sandwich();
		CheezeCornSandwich s = new CheezeCornSandwich();
		s.prepare();
		s.showRecipe();
		

	}

}
