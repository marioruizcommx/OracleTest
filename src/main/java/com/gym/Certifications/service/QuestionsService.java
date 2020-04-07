package com.gym.Certifications.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gym.Certifications.entity.Questions;
import com.gym.Certifications.model.QuestionModel;




public interface QuestionsService  extends JpaRepository<Questions, String> {
	
	public QuestionModel getQuestion(String clave_exam, int number_question);
	
	public int countQuestions(String clave_exam);

}
