package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setAccountType("saving accout");
		h.setAccountno(1299934567L);
		h.setAtmCardNo(837568687);
		h.setPinNo(3456);
		
		//System.out.println("Account No.is: "+h.getAccountNo());
		//below line will call to to String() method	
		System.out.println(h);
				

	}

}
