package org.tnsif.instanceofkeyword;

public class InstanceOfDemo {

	
		public static void main(String[] args) {
			SBI sbiObj = new SBI();
			
			System.out.println(sbiObj instanceof SBI);
			System.out.println(sbiObj instanceof RBI);
			
			RBI Obj2 = new SBI();
			
			System.out.println(Obj2.ifscCode);
	}

}
