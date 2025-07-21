package com.tka.p1SpringCRUD_HW;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity		// table("c1_student")
public class C1_Student {
	
	@Id
	int id;
	String name;
	float per;
	
	public C1_Student() {
		// TODO Auto-generated constructor stub
	}

	public C1_Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
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

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "C1_Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
