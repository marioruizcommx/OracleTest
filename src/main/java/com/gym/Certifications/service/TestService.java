package com.gym.Certifications.service;

import java.util.ArrayList;
import java.util.HashMap;



public interface TestService {
	
	public void resetTest();
	
	public ArrayList<String> getValidAnswers(String clave_exam,String questionNumber);
	
	public ArrayList<String> getQuestion(String clave_exam, String questionNumber);
	
	public void setFails(int questionNumber);
	
	public void setSuccess(int questionNumber);
	
	public void setQuestionNow(int questionNumber);
	
    public int getFails();
	
	public int getSuccess();
	
	public int getQuestionNow();

	
	public boolean getImage(String clave_exam, String imagenNumber);
	
	public ArrayList<Integer> failQuestionList();
	
	public ArrayList<Integer> successQuestionList();
	
	public boolean verifyAnswer(int numQue, ArrayList<String> answersUser, String exam);
	
	public void setImage(String imgNumber);
	
	public int getTier();
	
	public void setTier(int tier);
	
	public boolean getType();

	public void setType(boolean typeTest);

	int calculateScore(String clave_exam);
	
	int totalQuestions(String clave_exam);
	
	

}
