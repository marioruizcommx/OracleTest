package com.gym.Certifications.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gym.Certifications.component.ExamsConverter;
import com.gym.Certifications.entity.Exams;
import com.gym.Certifications.model.ExamModel;
import com.gym.Certifications.model.QuestionModel;
import com.gym.Certifications.repository.QuestionsRepository;
import com.gym.Certifications.repository.TechRepository;
import com.gym.Certifications.service.TechService;


@Service("techServiceImpl")
public class TechServiceImpl implements TechService{
	
	@Autowired
	@Qualifier("techRepository")
	private TechRepository techRepository;
	
	@Autowired
	@Qualifier("examsConverter")
	private ExamsConverter examsConverter;

	@Override
	public List<ExamModel> listAllTech() {
		// TODO Auto-generated method stub
		List<Exams> exams = techRepository.findAll();
		List<ExamModel> examModel = new ArrayList<ExamModel>();
		for (Exams exam : exams) {
			examModel.add(examsConverter.convertExams2Exams2Model(exam));
		}
		return examModel;
	}


	

}
