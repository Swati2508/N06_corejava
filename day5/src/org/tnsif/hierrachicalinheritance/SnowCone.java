package org.tnsif.hierrachicalinheritance;

public class SnowCone extends Android {
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	public SnowCone(String brandy, String slotType, int version ) {
		super(brandy, slotType);
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

}
