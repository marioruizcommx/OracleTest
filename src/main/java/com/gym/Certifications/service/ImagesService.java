package com.gym.Certifications.service;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gym.Certifications.entity.Images;
import com.gym.Certifications.model.ImagesModel;


public interface ImagesService  extends JpaRepository<Images, String>{
	
	public ImagesModel getImage(String clave_exam, int question_number);

}
