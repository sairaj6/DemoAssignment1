package com.Nissan.service;

import java.util.List;

import com.Nissan.model.Professor;



public interface IProfessorService {

	//List<Patient> listAllPatient();
		List<Professor> listAllProfessor();
	 
		Professor getProfessorById(Integer _patientId);
		
		Professor addProfessor(Professor _patient);
		
//		Professor updateProfessor(Integer _patientId);
		
		void deleteProfessor(Integer _patient);
}
