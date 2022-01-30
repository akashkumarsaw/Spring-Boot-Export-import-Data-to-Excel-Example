package com.springmvc.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	  @Id 
	  @Column(name = "id")
	  private long id;

	  @Column(name = "name")
	  private String name;

	  @Column(name = "email")
	  private String email;

	  @Column(name = "phone")
	  private String phone;

	  public Student() {

	  }

	  public Student(String name, String email, String phone) {
	    this.name = name;
	    this.email = email;
	    this.phone = phone;
	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getEmail() {
	    return email;
	  }
	  
	  public void setEmail(String email) {
		  this.email=email;
	  }

	  public String getPhone() {
		    return phone;
	  }
	  
	  public void setPhone(String phone) {
	    this.phone = phone;
	  }

	  @Override
	  public String toString() {
	    return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	  }
}
