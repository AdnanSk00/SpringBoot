package com.tka.p1SpringCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component		// parent
@Entity			// table("c1_employee")
public class C1_Employee {
	
	@Id
	int id;
	String name;
	double salary;
	String role;
	
	public C1_Employee() {
		System.err.println("Employee object created...");
	}
	
	public C1_Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public C1_Employee(int id, String name, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "C1_Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}
	
}


