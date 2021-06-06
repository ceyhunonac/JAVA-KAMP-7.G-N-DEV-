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
@Table(name="SystemEmployees")
@AllArgsConstructor
@NoArgsConstructor

public class SystemEmployees extends Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "SystemEmployees_UserName")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public SystemEmployees(int id, String email, String password, String passwordRepetition, String userName) {
		super(id, email, password, passwordRepetition);
		this.userName = userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}