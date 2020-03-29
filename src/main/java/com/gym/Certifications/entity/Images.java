package com.gym.Certifications.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="images")
public class Images {
	
	@Id
	@Column(name="clave_exam", unique=true, nullable=true, length = 100)
	public String clave_exam;
	@Column(name="number_question", nullable=true, length = 11)
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
	public Images(String clave_exam, int number_question) {
		super();
		this.clave_exam = clave_exam;
		this.number_question = number_question;
	}
	public Images() {

	}
	
	

}
