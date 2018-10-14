package com.course.rabbitmqconsumer.consumer.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty("employee_id")
	private String employeeId;

	private String name;

	@JsonProperty("birth_date")
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "America/Sao_Paulo")
	private Date brithDate;

	public Employee() {
		super();
	}

	public Employee(String employeeId, String name, Date brithDate) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.brithDate = brithDate;
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", brithDate=" + brithDate + "]";
	}

}
