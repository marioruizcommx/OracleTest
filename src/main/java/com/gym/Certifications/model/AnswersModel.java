package com.gym.Certifications.model;

public class AnswersModel {
	
	public String clave_exam;
	public int number_question;
	public int optionA;
	public int optionB;
	public int optionC;
	public int optionD;
	public int optionE;
	public int optionF;
	public int optionG;
	
	
	
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
	public int getOptionG() {
		return optionG;
	}
	public void setOptionG(int optionG) {
		this.optionG = optionG;
	}
	public int getOptionA() {
		return optionA;
	}
	public void setOptionA(int optionA) {
		this.optionA = optionA;
	}
	public int getOptionB() {
		return optionB;
	}
	public void setOptionB(int optionB) {
		this.optionB = optionB;
	}
	public int getOptionC() {
		return optionC;
	}
	public void setOptionC(int optionC) {
		this.optionC = optionC;
	}
	public int getOptionD() {
		return optionD;
	}
	public void setOptionD(int optionD) {
		this.optionD = optionD;
	}
	public int getOptionE() {
		return optionE;
	}
	public void setOptionE(int optionE) {
		this.optionE = optionE;
	}
	public int getOptionF() {
		return optionF;
	}
	public void setOptionF(int optionF) {
		this.optionF = optionF;
	}
	public AnswersModel(String clave_exam, int number_question, int optionA, int optionB, int optionC, int optionD,
			int optionE, int optionF, int optionG) {
		super();
		this.clave_exam = clave_exam;
		this.number_question = number_question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.optionG = optionG;
	}
	
	public AnswersModel() {
	}
	

    

	
	
	
	
	
}
