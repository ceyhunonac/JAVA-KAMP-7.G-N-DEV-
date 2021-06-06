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
@Table(name="JobTitles")
@AllArgsConstructor
@NoArgsConstructor

public class JobTitles {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JobTitles_Id")
	private int jobTitleId;
    
    @Column(name = "JobTitles_JobName")
	private String jobName;
	
	public int getJobTitleId() {
		return jobTitleId;
	}

	public void setJobTitleId(int jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public JobTitles(int jobTitleId, String jobName) {
		super();
		this.jobTitleId = jobTitleId;
		this.jobName = jobName;
	}

	
	
}