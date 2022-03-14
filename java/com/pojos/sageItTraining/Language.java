package com.pojos.sageItTraining;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Language {
	@Id
	private String id;
	private String laguageName;
	private String desc;
	
	@ManyToOne
	private Employee employee;

	public Language(String id, String laguageName, String desc, Employee employee) {
		super();
		this.id = id;
		this.laguageName = laguageName;
		this.desc = desc;
		this.employee = employee;
	}
	
	public Language() {};

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLaguageName() {
		return laguageName;
	}

	public void setLaguageName(String laguageName) {
		this.laguageName = laguageName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
