package com.gym.Certifications.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class QuestionModel {
	

	public String clave_exam;
	public int number_question;
	
	public String content1;
	public String content2;
	
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	public String answer5;
	public String answer6;
	public String answer7;
	public String answer8;
	public String answer9;
	public String answer10;
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
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getAnswer5() {
		return answer5;
	}
	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}
	public String getAnswer6() {
		return answer6;
	}
	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}
	public String getAnswer7() {
		return answer7;
	}
	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}
	public String getAnswer8() {
		return answer8;
	}
	public void setAnswer8(String answer8) {
		this.answer8 = answer8;
	}
	public String getAnswer9() {
		return answer9;
	}
	public void setAnswer9(String answer9) {
		this.answer9 = answer9;
	}
	public String getAnswer10() {
		return answer10;
	}
	public void setAnswer10(String answer10) {
		this.answer10 = answer10;
	}
	public QuestionModel(String clave_exam, int number_question, String content1, String content2, String answer1,
			String answer2, String answer3, String answer4, String answer5, String answer6, String answer7,
			String answer8, String answer9, String answer10) {
		super();
		this.clave_exam = clave_exam;
		this.number_question = number_question;
		this.content1 = content1;
		this.content2 = content2;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.answer7 = answer7;
		this.answer8 = answer8;
		this.answer9 = answer9;
		this.answer10 = answer10;
	}
	
	
	public QuestionModel() {

	}
	
	
	
	

	
	
	
	

}
