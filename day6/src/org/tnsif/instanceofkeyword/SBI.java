package org.tnsif.instanceofkeyword;

class SBI extends RBI {
	public SBI() {
		super.ifscCode = "RBISONGPA01";
		String ifscCode = "SBI09876354";
		
		// if parent and child class has variable with same name we use super keyword to access super class variable
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
	}
	
}

