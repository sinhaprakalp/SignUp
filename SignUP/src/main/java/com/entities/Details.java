package com.entities;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detail")

public class Details {

	@Id
	private int id;
	private String fname;
	private String uname;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Details(String fname, String uname, String password) {
		super();
		this.id = new Random().nextInt(100000);
		this.fname = fname;
		this.uname = uname;
		this.password = password;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

}
