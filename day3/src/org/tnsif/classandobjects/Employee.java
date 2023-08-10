//program to demonstrate of class and objects
package org.tnsif.classandobjects;
//class declaration
public class Employee {
	
	//default data members
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaration and definition
	void display()
	{
		System.out.println("Emp ID:"+empID);
		System.out.println("Emp Name:"+empName);
		System.out.println("Emp Salary:"+ salary);
		System.out.println("Emp Department:"+ department);
		
	}

}
