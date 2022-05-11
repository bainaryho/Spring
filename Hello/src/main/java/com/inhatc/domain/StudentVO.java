package com.inhatc.domain;


public class StudentVO {
	private String id ;
	private String name ;
	private String adress ;
	private String phone ;
	private String email ;
	
	
	public StudentVO() {
		super();
	}

	public StudentVO(String id, String name, String adress, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + ", email=" + email
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getAdress()=" + getAdress() + ", getPhone()="
				+ getPhone() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
