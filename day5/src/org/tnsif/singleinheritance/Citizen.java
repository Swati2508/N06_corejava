
package org.tnsif.singleinheritance;

//base class
public class Citizen {
	
	//private data member
	private String city;
	private int pincode;
	private String area;
	private long adharNo;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArrea() {
		return area;
	}
	public void setArrea(String arrea) {
		this.area = arrea;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", arrea=" + area + ", adharNo=" + adharNo + "]";
	}
	public Citizen() {
		super();
		
		System.out.println("Citizen-Parent Class");
	}
	public Citizen(String city, int pincode, String area, long adharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adharNo = adharNo;
	}
	
	
	
}
