package com.gym.Certifications.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gym.Certifications.entity.Answers;
import com.gym.Certifications.model.AnswersModel;



public interface AnswersService extends JpaRepository<Answers, String> {

	public AnswersModel getAnswer(String clave_exam, int number_question);

}
