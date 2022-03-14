package com.pojos.sageItTraining;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
@Id
private String empId;
private String name;
private long number;
private float salary;
private String companyName;

//@OneToMany
//private Language languege;
//public Language getLanguege() {
//	return languege;
//}
//public void setLanguege(Language languege) {
//	this.languege = languege;
//}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Employee(String empId, String name, long number, float salary, String companyName) {
	super();
	this.empId = empId;
	this.name = name;
	this.number = number;
	this.salary = salary;
	this.companyName = companyName;
	//this.languege=languege;
}
public Employee() {
	
	}
}
