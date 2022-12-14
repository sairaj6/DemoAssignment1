package com.Nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "tblprofessor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer professorId;
	private Integer managerId;
	private String firstName;
	private String lastName;
	private Integer deptNo;
	private Integer salary;
	private LocalDate joiningDate;
	private LocalDate dob;
	private Character gender;
	
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Professor(Integer professorId, Integer managerId, String firstName, String lastName, Integer deptNo,
			Integer salary, LocalDate joiningDate, LocalDate dob, Character gender) {
		super();
		this.professorId = professorId;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptNo = deptNo;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.dob = dob;
		this.gender = gender;
	}


	public Integer getProfessorId() {
		return professorId;
	}


	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}


	public Integer getManagerId() {
		return managerId;
	}


	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
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


	public Integer getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", managerId=" + managerId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deptNo=" + deptNo + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", dob=" + dob + ", gender=" + gender + "]";
	}
	


}
