package com.gym.Certifications.component;

import org.springframework.stereotype.Component;

import com.gym.Certifications.entity.Questions;
import com.gym.Certifications.model.QuestionModel;


@Component("questionsConverter")
public class QuestionsConverter {
	
	public Questions convert2QuestionsModel2Questions(QuestionModel questionsModel) {
		Questions questions = new Questions();
		questions.setClave_exam(questionsModel.clave_exam);
		questions.setNumber_question(questionsModel.number_question);
		questions.setContent1(questionsModel.content1);
		questions.setContent2(questionsModel.content2);
		questions.setAnswer2(questionsModel.answer2);
		questions.setAnswer3(questionsModel.answer3);
		questions.setAnswer4(questionsModel.answer4);
		questions.setAnswer5(questionsModel.answer5);
		questions.setAnswer6(questionsModel.answer6);
		questions.setAnswer7(questionsModel.answer7);
		questions.setAnswer8(questionsModel.answer8);
		questions.setAnswer9(questionsModel.answer9);
		questions.setAnswer10(questionsModel.answer10);
		
		return questions;
	}
	
	public QuestionModel convertQuestions2Questions2Model(Questions questions) {
		QuestionModel questionsModel = new QuestionModel();
		questionsModel.setClave_exam(questions.clave_exam);
		questionsModel.setNumber_question(questions.number_question);
		questionsModel.setContent1(questions.content1);
		questionsModel.setContent2(questions.content2);
		questionsModel.setAnswer1(questions.answer1);
		questionsModel.setAnswer2(questions.answer2);
		questionsModel.setAnswer3(questions.answer3);
		questionsModel.setAnswer4(questions.answer4);
		questionsModel.setAnswer5(questions.answer5);
		questionsModel.setAnswer6(questions.answer6);
		questionsModel.setAnswer7(questions.answer7);
		questionsModel.setAnswer8(questions.answer8);
		questionsModel.setAnswer9(questions.answer9);
		questionsModel.setAnswer10(questions.answer10);
		
		return questionsModel;
	}





}
