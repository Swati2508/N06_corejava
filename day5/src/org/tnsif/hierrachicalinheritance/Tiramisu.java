package org.tnsif.hierrachicalinheritance;

public class Tiramisu  extends Android{
	
	//private data members
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Tiramisu(String brandy, String slotType, int version) {
		super(brandy, slotType);
		this.version = version;
		
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

}
