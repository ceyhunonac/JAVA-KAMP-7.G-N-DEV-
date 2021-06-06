package com.campday6.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor

public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Users_Id")
	private int id;
	
	@Column(name = "Users_E-Mail")
	private String email;
	
	@Column(name = "Users_Password")
	private String Password;
	
	@Column(name = "Users_PasswordRepetition")
	private String passwordRepetition;
	
	public Users(int id, String email, String password, String passwordRepetition) {
		super();
		this.id = id;
		this.email = email;
		Password = password;
		this.passwordRepetition = passwordRepetition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPasswordRepetition() {
		return passwordRepetition;
	}

	public void setPasswordRepetition(String passwordRepetition) {
		this.passwordRepetition = passwordRepetition;
	}


	
	
}