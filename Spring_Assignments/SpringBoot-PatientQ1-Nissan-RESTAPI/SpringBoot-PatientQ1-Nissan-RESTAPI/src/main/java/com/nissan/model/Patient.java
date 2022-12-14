package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.joda.time.DateTime;

@Entity
@Table(name = "tblpatient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	patientId;
	@Column(nullable = false)
	private Integer	registrationNo;
	@Column(nullable = false, length = 50)
	private String	patientName;
	private DateTime DOB;
	private Character gender;
	private String	address;
	@Column(nullable = false, unique = true)
	private String phoneNo;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(Integer patientId, Integer registrationNo, String patientName, DateTime dOB, Character gender,
			String address, String phoneNo) {
		super();
		this.patientId = patientId;
		this.registrationNo = registrationNo;
		this.patientName = patientName;
		DOB = dOB;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
	}


	public Integer getPatientId() {
		return patientId;
	}


	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}


	public Integer getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(Integer registrationNo) {
		this.registrationNo = registrationNo;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public DateTime getDOB() {
		return DOB;
	}


	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", registrationNo=" + registrationNo + ", patientName=" + patientName
				+ ", DOB=" + DOB + ", gender=" + gender + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", getPatientId()=" + getPatientId() + ", getRegistrationNo()=" + getRegistrationNo()
				+ ", getPatientName()=" + getPatientName() + ", getDOB()=" + getDOB() + ", getGender()=" + getGender()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
