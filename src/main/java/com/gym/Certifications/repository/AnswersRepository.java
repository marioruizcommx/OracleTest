package com.gym.Certifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gym.Certifications.entity.Answers;


@Repository("answersRepository")
public interface AnswersRepository extends JpaRepository<Answers,Long > {
	
	@Query("SELECT t FROM Answers t WHERE t.clave_exam = ?1 AND t.number_question = ?2")
	Answers findAnswerBy(String clave_exam, int number_question);
	
}
