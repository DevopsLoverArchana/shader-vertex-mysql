package com.example.studentdatabase.model;

public class student {

	int id;
	String name;
	String address;
	String emailid;
	String branch;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid= emailid;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public student(int id, String name, String address, int mobileNo, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.emailid= emailid;
		this.branch = branch;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + emailid + ", branch="
				+ branch + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
