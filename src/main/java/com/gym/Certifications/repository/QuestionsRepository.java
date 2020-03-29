package com.gym.Certifications.repository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gym.Certifications.entity.Questions;



@Repository("questionsRepository")
public interface QuestionsRepository extends JpaRepository<Questions,Long > {
	
	
	@Query("SELECT t FROM Questions t WHERE t.clave_exam = ?1 AND t.number_question = ?2")
	Questions findQuestionBy(String clave_exam, int number_question);

}
