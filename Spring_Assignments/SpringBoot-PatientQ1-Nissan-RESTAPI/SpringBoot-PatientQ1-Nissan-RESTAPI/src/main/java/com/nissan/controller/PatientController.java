package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Patient;
import com.nissan.service.IPatientService;

@RestController
@RequestMapping("api/")
public class PatientController {
	
	@Autowired
	IPatientService patientService;
	
	@GetMapping("patients")
	public List<Patient> getAllEmployees()
	{
		return patientService.listAllPatient();
	}
	
	@GetMapping("patients/{_patientId}")
	public Patient getPatientById(@PathVariable Integer _patientId)
	{
		return patientService.getPatientById(_patientId);
	}
	
	@PostMapping("patients")
	public Patient addPatient(@RequestBody Patient _patient)
	{
		return patientService.addPatient(_patient);
	}
	
	
	
	
	@DeleteMapping("patients/{_patientId}")
	public void deletePatient(@PathVariable Integer _patientId)
	{
		patientService.deletePatient(_patientId);
	}
	
}
