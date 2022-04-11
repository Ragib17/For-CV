package classes;

import java.lang.*;

public class Employee{
	protected String name ;
	protected String empId
 ;
	protected double salary ;

	public void setName(String name){this.name = name ;}
	public void setEmpId(String empId){this.empId = empId ;}
	public void setSalary(double salary){this.salary = salary ;}

	public String getName(){return name ;}
	public String getEmpId(){return empId ;}
	public double getSalary(){return salary ;}

	
}