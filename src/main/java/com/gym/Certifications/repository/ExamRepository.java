package com.gym.Certifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gym.Certifications.entity.Exams;


@Repository("examRepository")
public interface ExamRepository extends JpaRepository<Exams,Long > {
	
	@Query("SELECT count(t) FROM Questions t WHERE t.clave_exam = ?1")
	int countQuestions(String clave_exam);

}


