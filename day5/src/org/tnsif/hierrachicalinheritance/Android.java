package org.tnsif.hierrachicalinheritance;
//base class
public class Android {
	
	private String brandy;
	private String slotType;
	public String getBrandy() {
		return brandy;
	}
	public void setBrandy(String brandy) {
		this.brandy = brandy;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [brandy=" + brandy + ", slotType=" + slotType + "]";
	}
	public Android(String brandy, String slotType) {
		super();
		this.brandy = brandy;
		this.slotType = slotType;
	}
	
	
	

}
