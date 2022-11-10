package com.zohocrmapp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(name="first_name",length=45,nullable=false)
private String firstName;
@Column(name="last_name",length=45,nullable=false)
private String lastName;
@Column(name="email",length=128,nullable=false,unique=true)
private String Email;
@Column(name="mobile",length=10,nullable=false,unique=true)
private long mobile;

private String source;
public long getId() {
		return id;
}
public void setId(long id) {
		this.id = id;
}
public String getFirstName() {
		return firstName;
}
public void setFirstName(String firstName) {
		this.firstName = firstName;
}
public String getLastName() {
		return lastName;
}
public void setLastName(String lastName) {
		this.lastName = lastName;
}
public String getEmail() {
		return Email;
}
public void setEmail(String email) {
		Email = email;
}
public long getMobile() {
		return mobile;
}
public void setMobile(long mobile) {
		this.mobile = mobile;
}
public String getSource() {
		return source;
}
public void setSource(String source) {
		this.source = source;
}
}