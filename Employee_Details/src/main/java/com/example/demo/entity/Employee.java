package com.example.demo.entity;

public class Employee {

	private int empID, empSal, empAge;
	private String empName;

	public Employee(int empID, int empSal, String empName) {
		super();
		this.empID = empID;
		this.empSal = empSal;
		this.empName = empName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/*
	 * @Override public String toString() { return "Employee [empID=" + empID +
	 * ", empSal=" + empSal + ", empAge=" + empAge + ", empName=" + empName + "]"; }
	 */

}
