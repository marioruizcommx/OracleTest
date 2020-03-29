package com.gym.Certifications.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exams")
public class Exams {
	
	
	
	@Id
	@Column(name="technology", unique=true, nullable=true, length = 100)
	public String technology;
	@Column(name="clave_exam", unique=true, nullable=true, length = 100)
	public String clave_exam;
	@Column(name="number_question", unique=true, nullable=true, length = 100)
	public int number_question;
	@Column(name="time_exam", unique=true, nullable=true, length = 100)
    public int time_exam;
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getClave_exam() {
		return clave_exam;
	}
	public void setClave_exam(String clave_exam) {
		this.clave_exam = clave_exam;
	}
	public int getNumber_question() {
		return number_question;
	}
	public void setNumber_question(int number_question) {
		this.number_question = number_question;
	}
	public int getTime_exam() {
		return time_exam;
	}
	public void setTime_exam(int time_exam) {
		this.time_exam = time_exam;
	}
	public Exams(String technology, String clave_exam, int number_question, int time_exam) {
		super();
		this.technology = technology;
		this.clave_exam = clave_exam;
		this.number_question = number_question;
		this.time_exam = time_exam;
	}
	
	public Exams() {
	}
	
	
	

}
