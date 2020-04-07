package com.gym.Certifications.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gym.Certifications.component.AnswersConverter;
import com.gym.Certifications.entity.Answers;
import com.gym.Certifications.model.AnswersModel;
import com.gym.Certifications.repository.AnswersRepository;
import com.gym.Certifications.service.AnswersService;


@Service("answersServiceImpl")
public class AnswersServiceImpl implements AnswersService {
	
	@Autowired
	@Qualifier("answersConverter")
	private AnswersConverter answersConverter;
	
	@Autowired
	@Qualifier("answersRepository")
	private AnswersRepository answersRepository;

	@Override
	public List<Answers> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Answers> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Answers> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Answers> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Answers> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Answers getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Answers> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Answers> findById(String id) {
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
	public void delete(Answers entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Answers> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Answers> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Answers> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public <S extends Answers> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public AnswersModel getAnswer(String clave_exam, int number_question) {
		Answers answerEntity = answersRepository.findAnswerBy(clave_exam,number_question);
		
		AnswersModel answersModel = new AnswersModel();
		answersModel = answersConverter.convertAnswers2Answers2Model(answerEntity);
	    
		
		return answersModel;
	}

	
}
