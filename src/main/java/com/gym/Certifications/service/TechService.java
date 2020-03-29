package com.gym.Certifications.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.Certifications.entity.Exams;
import com.gym.Certifications.model.ExamModel;
import com.gym.Certifications.model.QuestionModel;


public interface TechService{
	
	public abstract List<ExamModel> listAllTech();


}
