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

import com.gym.Certifications.component.ImagesConverter;
import com.gym.Certifications.entity.Images;
import com.gym.Certifications.model.ImagesModel;
import com.gym.Certifications.repository.ImagesRepository;
import com.gym.Certifications.service.ImagesService;



@Service("imagesServiceImpl")
public class ImagesServiceImpl implements ImagesService{
	
	@Autowired
	@Qualifier("imagesConverter")
	private ImagesConverter imagesConverter;
	
	@Autowired
	@Qualifier("imagesRepository")
	private ImagesRepository imagesRepository;

	@Override
	public List<Images> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Images> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Images> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Images> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Images> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Images getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Images> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Images> findById(String id) {
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
	public void delete(Images entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Images> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Images> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Images> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Images> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	public ImagesModel getImage(String clave_exam, int question_number) {

		Images imageEntity = imagesRepository.findImageBy("", 1);
		
		ImagesModel imagesModel = new ImagesModel();
		
		imagesModel = imagesConverter.convertImages2Images2Model(imageEntity);

		return imagesModel;
	}

}
