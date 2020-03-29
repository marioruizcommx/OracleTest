package com.gym.Certifications.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answers {
	
	@Id
	@Column(name="clave_exam", unique=true, nullable=true, length = 100)
	public String clave_exam;
	@Column(name="number_question", nullable=true, length = 11)
	public int number_question;
	@Column(name="a", nullable=true, length = 11)
	public int a;
	@Column(name="b", nullable=true, length = 11)
	public int b;
	@Column(name="c", nullable=true, length = 11)
	public int c;
	@Column(name="d", nullable=true, length = 11)
	public int d;
	@Column(name="e", nullable=true, length = 11)
	public int e;
	@Column(name="f", nullable=true, length = 11)
	public int f;
	@Column(name="g", nullable=true, length = 11)
	public int g;
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
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public Answers(String clave_exam, int number_question, int a, int b, int c, int d, int e, int f, int g) {
		super();
		this.clave_exam = clave_exam;
		this.number_question = number_question;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
	}
	
	public Answers() {

	}
	
	

}
