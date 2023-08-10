package org.tnsif.singledimensionalarray;
//program to demonstrate on array of objects 
public class Employees {
	
	private int ID;
	private String name;
	private double Salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employees(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		Salary = salary;
	}
	

}
