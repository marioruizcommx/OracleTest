package com.gym.Certifications.component;

import org.springframework.stereotype.Component;

import com.gym.Certifications.entity.Answers;
import com.gym.Certifications.model.AnswersModel;



@Component("answersConverter")
public class AnswersConverter {
	
	public Answers convert2AnswersModel2Answers(AnswersModel answersModel) {
		Answers answers = new Answers();
		answers.setClave_exam(answersModel.clave_exam);
		answers.setNumber_question(answersModel.number_question);
		answers.setA(answersModel.optionA);
		answers.setB(answersModel.optionB);
		answers.setC(answersModel.optionC);
		answers.setD(answersModel.optionD);
		answers.setE(answersModel.optionE);
		answers.setF(answersModel.optionF);
		answers.setG(answersModel.optionG);
		return answers;
	}
	
	public AnswersModel convertAnswers2Answers2Model(Answers answers) {
		AnswersModel answersModel = new AnswersModel();
		answersModel.setClave_exam(answers.clave_exam);
		answersModel.setNumber_question(answers.number_question);
		answersModel.setOptionA(answers.a);
		answersModel.setOptionB(answers.b);
		answersModel.setOptionC(answers.c);
		answersModel.setOptionD(answers.d);
		answersModel.setOptionE(answers.e);
		answersModel.setOptionF(answers.f);
		answersModel.setOptionG(answers.g);
		return answersModel;
	}

}
