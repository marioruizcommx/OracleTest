package com.gym.Certifications.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gym.Certifications.entity.Images;





@Repository("imagesRepository")
public interface ImagesRepository extends JpaRepository<Images,Long > {
	
	@Query("SELECT t FROM Images t WHERE t.clave_exam = ?1 AND t.number_question = ?2")
	Images findImageBy(String clave_exam, int number_question);

}
