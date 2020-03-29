package com.gym.Certifications.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gym.Certifications.entity.Exams;


@Repository("techRepository")
public interface TechRepository extends JpaRepository<Exams,Long > {
	
	public abstract List<Exams> findTechBy();
	

	
 
}
