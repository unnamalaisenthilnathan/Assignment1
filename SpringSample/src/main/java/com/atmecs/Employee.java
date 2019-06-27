package com.atmecs;

public class Employee {
int employeeid;
String employeename;
String employeeaddress;


public Employee()
{
}


public Employee(int employeeid, String employeename, String employeeaddress) {
	super();
	this.employeeid = employeeid;
	this.employeename = employeename;
	this.employeeaddress = employeeaddress;
}


public int getEmployeeid() {
	return employeeid;
}


public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}


public String getEmployeename() {
	return employeename;
}


public void setEmployeename(String employeename) {
	this.employeename = employeename;
}


public String getEmployeeaddress() {
	return employeeaddress;
}


public void setEmployeeaddress(String employeeaddress) {
	this.employeeaddress = employeeaddress;
}


@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
			+ employeeaddress + "]";
}

}