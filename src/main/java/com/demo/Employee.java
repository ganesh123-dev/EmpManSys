//The program is about storing employee data using collection data type using arraylist
//and performing CURD operations on the data.
//NOTE: 1)Employee.java--> a getters and setters class file to pass this a an object to
//Storage.java class.
//2)Storage.java it takes wrapper class as an object i.e., Employee.java
//3)Main.java control of the program is done here.
//For more info: See Edureka Day8 Assignament problem.

package com.demo;

public class Employee {
	
	private int e_Id;
	private String e_fName;
	private String e_lName;
	private int e_Age;
	public int getE_Id() {
		return e_Id;
	}
	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}
	public String getE_fName() {
		return e_fName;
	}
	public void setE_fName(String e_fName) {
		this.e_fName = e_fName;
	}
	public String getE_lName() {
		return e_lName;
	}
	public void setE_lName(String e_lName) {
		this.e_lName = e_lName;
	}
	public int getE_Age() {
		return e_Age;
	}
	public void setE_Age(int e_Age) {
		this.e_Age = e_Age;
	}
	
	

}
