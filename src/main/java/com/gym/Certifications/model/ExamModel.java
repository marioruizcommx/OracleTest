package com.gym.Certifications.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class ExamModel {
	

	public String technology;
	public String clave_exam;
	public int number_question;
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
	public ExamModel(String technology, String clave_exam, int number_question, int time_exam) {
		super();
		this.technology = technology;
		this.clave_exam = clave_exam;
		this.number_question = number_question;
		this.time_exam = time_exam;
	}
	
	public ExamModel() {

	}

	

}
