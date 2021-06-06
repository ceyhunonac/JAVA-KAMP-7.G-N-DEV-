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
@Table(name="Employers")
@AllArgsConstructor
@NoArgsConstructor

public class Employers extends Users {
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employers_CompanyName")
	private String companyName;
	 @Column(name = "Employers_WebSite")
	private String webSite;
		
	@Column(name = "Employers_Phone")
	private String phone;
		
	
	public Employers(int id, String email, String password, String passwordRepetition, String companyName,
			String webSite, String phone) {
		super(id, email, password, passwordRepetition);
		this.companyName = companyName;
		this.webSite = webSite;
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}