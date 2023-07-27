package org.tnsif.multilevelinheritance;
//parent class
public class Manager {

	
	private String DeptName;
	private String Name;
	private int empID;
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "Manager [DeptName=" + DeptName + ", Name=" + Name + ", empID=" + empID + "]";
	}
	
	//parameterized constructor
	public Manager(String deptName, String name, int empID) {
		super();
		this.DeptName = deptName;
		this.Name = name;
		this.empID = empID;
	}
	
	
}
