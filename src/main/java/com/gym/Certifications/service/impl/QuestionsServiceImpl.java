package com.gym.Certifications.service.impl;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gym.Certifications.component.QuestionsConverter;
import com.gym.Certifications.entity.Questions;
import com.gym.Certifications.model.QuestionModel;
import com.gym.Certifications.repository.QuestionsRepository;
import com.gym.Certifications.service.QuestionsService;


@Service("questionsServiceImpl")
public class QuestionsServiceImpl implements QuestionsService{
	
	@Autowired
	@Qualifier("questionsConverter")
	private QuestionsConverter questionsConverter;
	
	@Autowired
	@Qualifier("questionsRepository")
	private QuestionsRepository questionsRepository;


    public QuestionModel getQuestion(String clave_exam, int number_question) {
    	
	Questions questionEntity = questionsRepository.findQuestionBy("1Z0-808",1);
	
	QuestionModel questionsModel = new QuestionModel();
	questionsModel = questionsConverter.convertQuestions2Questions2Model(questionEntity);
    
	
	return questionsModel;

    }


	@Override
	public List<Questions> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Questions> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Questions> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends Questions> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteInBatch(Iterable<Questions> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Questions getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Questions> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Questions> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Questions entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends Questions> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends Questions> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Questions> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends Questions> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


}
