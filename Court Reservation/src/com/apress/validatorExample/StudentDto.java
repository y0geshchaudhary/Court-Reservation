package com.apress.validatorExample;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class StudentDto 
{
	
	/*@NotEmpty(message="Name Cannot be empty.")
	@NotNull(message="Name Cannot be null.")
	@NotBlank(message="Name Cannot be blank.")*/
	@Size(max=10, min=5 ,message="Name must be in 5 to 10 characters.")
	private String name;
	
	@Size(max=2)
	/*@NotEmpty(message="Age cannot be empty.")*/
	private int age;
	
	@Email(message="please enter a valid email.")
	private String email;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}  
	
	
	
	
}
