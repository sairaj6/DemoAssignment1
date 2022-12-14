package com.nissan.service;

import java.util.List;

import com.nissan.model.Patient;


public interface IPatientService {
	
	//List<Patient> listAllPatient();
	List<Patient> listAllPatient();
 
	Patient getPatientById(Integer _patientId);
	
	Patient addPatient(Patient _patient);
	
	Patient updatePatient(Integer _patientId);
	
	void deletePatient(Integer _patient);

}
