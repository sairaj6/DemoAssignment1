package com.Nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.Nissan.model.Professor;

public interface IProfessorDAO extends JpaRepositoryImplementation<Professor, Integer> {

}
