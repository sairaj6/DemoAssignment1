package com.Nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nissan.model.Professor;
import com.Nissan.service.IProfessorService;

@RestController
@RequestMapping("api/")
public class ProfessorController {
	
	@Autowired
	IProfessorService professorService;
	
	@GetMapping("professors")
	public List<Professor> getAllProfessor()
	{
		return professorService.listAllProfessor();
	}
	
	@GetMapping("professors/{_professorId}")
	public Professor getPatientById(@PathVariable Integer _professorId)
	{
		return professorService.getProfessorById(_professorId);
	}
	
	
	@PostMapping("professors")
	public Professor addPatient(@RequestBody Professor _professor)
	{
		return professorService.addProfessor(_professor);
	}
	
	
	
	
	@DeleteMapping("professors/{_professorId}")
	public void deletePatient(@PathVariable Integer _professorId)
	{
		professorService.deleteProfessor(_professorId);
	}
	
	
}
