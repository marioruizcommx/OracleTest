package com.gym.Certifications.component;

import org.springframework.stereotype.Component;

import com.gym.Certifications.entity.Exams;
import com.gym.Certifications.model.ExamModel;

@Component("examsConverter")
public class ExamsConverter {
	
	public Exams convert2ExamsModel2Exams(ExamModel examModel) {
		Exams exams = new Exams();
		exams.setTechnology(examModel.technology);
		exams.setClave_exam(examModel.clave_exam);
		exams.setNumber_question(examModel.getNumber_question());
		exams.setTime_exam(examModel.time_exam);

		return exams;
	}
	
	public ExamModel convertExams2Exams2Model(Exams exams) {
		ExamModel examModel = new ExamModel();
		examModel.setTechnology(exams.technology);
		examModel.setClave_exam(exams.clave_exam);
		examModel.setNumber_question(exams.getNumber_question());
		examModel.setTime_exam(exams.time_exam);
		return examModel;
	}
	
	

}
