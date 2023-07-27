package org.tnsif.singleinheritance;
//child class
public class Student extends Citizen {
	
	private int rollNo;
	private String CollegeName;
	
	//getter and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	
	//parameterized constructor
	public Student(String city, int pincode, String area, long adharNo, int rollNo, String CollegeName) {
		super(city, pincode, area, adharNo);
		
		this.rollNo = rollNo;
		this.CollegeName = CollegeName;
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", CollegeName=" + CollegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
