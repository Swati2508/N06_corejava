package org.tnsif.singledimensionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		Employees arr[]=new Employees[3];
		arr[0]=new Employees(101,"kaveri",67000.45);
		arr[1]=new Employees(102,"swati",64000.46);
		arr[2]=new Employees(103,"sakshi",65700.47);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "
		                        +arr[i].getSalary());
		}
		

	}

}
