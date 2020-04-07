package com.gym.Certifications.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gym.Certifications.controller.TestController;
import com.gym.Certifications.model.AnswersModel;
import com.gym.Certifications.model.ImagesModel;
import com.gym.Certifications.model.ImgModel;
import com.gym.Certifications.model.QuestionModel;
import com.gym.Certifications.model.TestModel;
import com.gym.Certifications.service.TestService;



@Service("TestServiceImpl")
public class TestServiceImpl implements TestService {
	

	@Autowired
	@Qualifier("questionsServiceImpl")
	private QuestionsServiceImpl questionsServiceImpl;
	
	@Autowired
	@Qualifier("answersServiceImpl")
	private AnswersServiceImpl answersServiceImpl;
	
	@Autowired
	@Qualifier("imagesServiceImpl")
	private ImagesServiceImpl imagesServiceImpl;

	private static final Log LOG = LogFactory.getLog(TestController.class);
	HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

	ArrayList<Integer> fails = new ArrayList<Integer>();
	ArrayList<Integer> success = new ArrayList<Integer>();
	public int fail = 0;
	public int succes = 1;
	public int tier = 1;
	public boolean typeTest;
	
	
	
	
	@Override
	public ArrayList<String> getValidAnswers(String clave_exam, String questionNumber){

		
		ArrayList<String> answer = new ArrayList<String>();
		AnswersModel qm = new AnswersModel();
		qm= answersServiceImpl.getAnswer(clave_exam, Integer.valueOf(questionNumber));
		
		

		answer.add("");
		answer.add("");
		if(qm.getOptionA()!=0) {
			answer.add("A");
		}else {
			answer.add("");
		}
		if(qm.getOptionB()!=0) {
			answer.add("B");
		}else {
			answer.add("");
		}
		if(qm.getOptionC()!=0) {
			answer.add("C");
		}else {
			answer.add("");
		}
		if(qm.getOptionD()!=0) {
			answer.add("D");
		}else {
			answer.add("");
		}
		if(qm.getOptionE()!=0) {
			answer.add("E");
		}else {
			answer.add("");
		}
		if(qm.getOptionF()!=0) {
			answer.add("F");
		}else {
			answer.add("");
		}
		if(qm.getOptionG()!=0) {
			answer.add("G");
		}else {
			answer.add("");
		}
		

		
		
		//answer = answers.get(Integer.valueOf(questionNumber));
		return answer;
		
		
		
		
		
	}

	public ArrayList<String> getQuestion(String clave_exam ,String questionNumber) {


		ArrayList<String> question = new ArrayList<String>();
		QuestionModel qm = new QuestionModel();
		qm= questionsServiceImpl.getQuestion(clave_exam, Integer.valueOf(questionNumber));

		question.add(qm.getContent1());
		question.add(qm.getContent2());
		question.add(qm.getAnswer1());
		question.add(qm.getAnswer2());
		question.add(qm.getAnswer3());
		question.add(qm.getAnswer4());
		question.add(qm.getAnswer5());
		question.add(qm.getAnswer6());
		question.add(qm.getAnswer7());
		question.add(qm.getAnswer8());
		question.add(qm.getAnswer9());
		question.add(qm.getAnswer10());

		return question;

	}

	@Override
	public void setFails(int questionNumber) {
		fail = fail + 1;

		fails.add(questionNumber);
	}

	@Override
	public void setSuccess(int questionNumber) {
		succes = succes + 1;
		success.add(questionNumber);
	}

	@Override
	public int calculateScore(String clave_exam) {
		
		int countQuestions = questionsServiceImpl.countQuestions(clave_exam);
		try {
			int scoreFinal = (succes * 100) / countQuestions;
			return scoreFinal;
		} catch (Exception e) {
			return 1;
		}
	}

	@Override
	public boolean getImage(String clave_exam, String imagenNumber) {
         boolean result = false;

		 ImagesModel img = new ImagesModel();

		
		 try {
		  img = imagesServiceImpl.getImage(clave_exam, Integer.valueOf(imagenNumber));
		 }catch(Exception e) {
			 return false;
		 }

		  if (String.valueOf(img.getNumber_question()) != null) {
  
						  return true;
		
		  }else {
			  
			  return false;
			  
		  }

	

		 

	}

	@Override
	public ArrayList<Integer> failQuestionList() {

		return fails;
	}

	@Override
	public ArrayList<Integer> successQuestionList() {
		// TODO Auto-generated method stub
		return success;
	}
	

	@Override
	public boolean verifyAnswer(int questionNumber, ArrayList<String> answersUser, String exam) {
		HashMap<Integer, ArrayList<String>> answers = new HashMap<Integer, ArrayList<String>>();
		// answersUser.add(String.valueOf(questionNumber));
		ArrayList<String> answer = new ArrayList<String>();
		ArrayList<String> answerBase = new ArrayList<String>();
		AnswersModel qm = new AnswersModel();
		qm= answersServiceImpl.getAnswer(exam, questionNumber);
		
		answerBase.add(String.valueOf(questionNumber));
		
		if(qm.getOptionA()!=0) {
			answerBase.add("A");
		}
		if(qm.getOptionB()!=0) {
			answerBase.add("B");
		}
		if(qm.getOptionC()!=0) {
			answerBase.add("C");
		}
		if(qm.getOptionD()!=0) {
			answerBase.add("D");
		}
		if(qm.getOptionE()!=0) {
			answerBase.add("E");
		}
		if(qm.getOptionF()!=0) {
			answerBase.add("F");
		}
		if(qm.getOptionG()!=0) {
			answerBase.add("G");
		}
		
		answers.put(0, answerBase);

		answer = answers.get(0);

		int totalAnswers = answer.size();

		if (totalAnswers == 1) {

			if (answersUser.get(questionNumber) == answer.get(0)) {
				setSuccess(getSuccess() + 1);
				return true;
			} else {
				setFails(getFails() + 1);
				return false;
			}

		} else {

			Collections.sort(answersUser);
			Collections.sort(answer);
			if (answersUser.equals(answer)) {
				setSuccess(getSuccess() + 1);
				return true;
			} else {
				setFails(getFails() + 1);
				return false;
			}

		
		}

	}

	@Override
	public void setQuestionNow(int questionNumber) {
		TestModel jm = new TestModel();
		jm.setQuetionNow(questionNumber);

	}

	@Override
	public int getFails() {
		return fail;
	}

	@Override
	public int getSuccess() {

		return succes;
	}

	@Override
	public int getQuestionNow() {

		return fail;
	}

	@Override
	public void setImage(String imgNumber) {
		ImgModel img = new ImgModel();
		String image = imgNumber + ".jpg";
		img.setImgNumber(image);

	}

	@Override
	public int getTier() {
		return tier;
	}

	@Override
	public void setTier(int tier) {
		this.tier = tier + 1;

	}
	
	@Override
	public boolean getType() {
		return typeTest;
	}

	@Override
	public void setType(boolean typeTest) {
		this.typeTest = typeTest;

	}

	@Override
	public void resetTest() {
		this.fail = 0;
		this.succes = 1;
		this.tier = 1;
	}

	@Override
	public int totalQuestions(String clave_exam) {
		int countQuestions = questionsServiceImpl.countQuestions(clave_exam);
		return countQuestions;
	}


	
	

}
