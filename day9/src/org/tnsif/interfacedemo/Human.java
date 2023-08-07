package org.tnsif.interfacedemo;

public class Human implements ColdDrink,AlcoholDrink {

	@Override
	public void showdrink() {
		System.out.println(colddrinkName+" "+ alcoholdrinkType+" "+brand);
		
	}

	
	

}
