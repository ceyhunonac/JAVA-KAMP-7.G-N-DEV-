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
@Table(name="JobSeekers")
@AllArgsConstructor
@NoArgsConstructor


public class JobSeekers extends Users {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JobSeekers_FirstName")
	private String firstName;
	   
	@Column(name = "JobSeekers_LastName")
	private String lastName;
		
	@Column(name = "JobSeekers_TrNu")
	private String TrNu;
		
	@Column(name = "JobSeekers_BirthYear")
	private int birthYear;
	
	@Column(name = "isCompanyEmplooyer")
	private boolean isCompanyEmplooyer;
		
	
	
	public JobSeekers(int id, String email, String password, String passwordRepetition, String firstName,
			String lastName, String trNu, int birthYear, boolean isCompanyEmplooyer) {
		super(id, email, password, passwordRepetition);
		this.firstName = firstName;
		this.lastName = lastName;
		TrNu = trNu;
		this.birthYear = birthYear;
		this.isCompanyEmplooyer = isCompanyEmplooyer;
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

	public String getTrNu() {
		return TrNu;
	}

	public void setTrNu(String trNu) {
		TrNu = trNu;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public boolean isCompanyEmplooyer() {
		return isCompanyEmplooyer;
	}

	public void setCompanyEmplooyer(boolean isCompanyEmplooyer) {
		this.isCompanyEmplooyer = isCompanyEmplooyer;
	}

	
	
	
}