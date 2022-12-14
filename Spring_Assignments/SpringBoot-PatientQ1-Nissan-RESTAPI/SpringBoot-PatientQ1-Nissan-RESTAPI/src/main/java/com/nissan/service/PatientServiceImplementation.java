package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IPatientDAO;
import com.nissan.model.Patient;

@Service
public class PatientServiceImplementation implements IPatientService {

	@Autowired
	IPatientDAO patientDAO;
	


	@Override
	public List<Patient> listAllPatient() {
		
		return patientDAO.findAll();
	}



	@Override
	public Patient getPatientById(Integer _patientId) {
		// TODO Auto-generated method stub
		return patientDAO.findById(_patientId).orElse(null);
	}



	@Override
	public Patient addPatient(Patient _patient) {
		// TODO Auto-generated method stub
		return patientDAO.save(_patient);
	}



	@Override
	public Patient updatePatient(Integer _patient) {
		
		Patient _newPatient = getPatientById(_patient);
		
		
		
		return patientDAO.save(_newPatient);
	}



	@Override
	public void deletePatient(Integer _patient) {
		
		patientDAO.deleteById(_patient);
	}
	
	
	
	
	
}
