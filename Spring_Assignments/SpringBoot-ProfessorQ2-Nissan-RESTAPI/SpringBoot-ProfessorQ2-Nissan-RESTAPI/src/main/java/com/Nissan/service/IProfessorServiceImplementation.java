package com.Nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nissan.dao.IProfessorDAO;
import com.Nissan.model.Professor;

@Service
public class IProfessorServiceImplementation implements IProfessorService{

	
	@Autowired
	IProfessorDAO professorDAO;
	
	
	@Override
	public List<Professor> listAllProfessor() {
		// TODO Auto-generated method stub
		return professorDAO.findAll();
	}

	@Override
	public Professor getProfessorById(Integer _professor) {
		// TODO Auto-generated method stub
		return professorDAO.findById(_professor).orElse(null);
	}

	@Override
	public Professor addProfessor(Professor _professor) {
		
		return professorDAO.save(_professor);
	}

	@Override
	public void deleteProfessor(Integer _professorId) {
		
		professorDAO.deleteById(_professorId);
		
	}

}
