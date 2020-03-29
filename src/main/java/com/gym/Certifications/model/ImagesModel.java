package com.gym.Certifications.model;

import javax.persistence.Column;

public class ImagesModel {
	
	public String clave_exam;
	public int number_question;
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
	public ImagesModel(String clave_exam, int number_question) {
		super();
		this.clave_exam = clave_exam;
		this.number_question = number_question;
	}
	public ImagesModel() {

	}
	
	
	

}
