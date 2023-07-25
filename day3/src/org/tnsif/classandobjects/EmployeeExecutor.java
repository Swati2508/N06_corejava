package org.tnsif.classandobjects;

public class EmployeeExecutor {
	
	public static void main(String[] args)
	{
		//object creation
		Employee e= new Employee();
		e.empID=132981;
		e.empName="Swati Thombare";
		e.salary=78000;
		e.department="IT";
				//method call
		e.display();
	}
}
