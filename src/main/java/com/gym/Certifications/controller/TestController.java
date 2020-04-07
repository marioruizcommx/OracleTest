package com.gym.Certifications.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gym.Certifications.constant.ViewConstant;
import com.gym.Certifications.model.AnswersModel;

import com.gym.Certifications.service.TestService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Consumer;



@Controller
public class TestController {

	private static final Log LOG = LogFactory.getLog(TestController.class);
	public String numQue="1";

	@Autowired
	@Qualifier("TestServiceImpl")
	private TestService testService;


	
	@GetMapping("/test")
	public ModelAndView showTest(@RequestParam(name = "typeTest", required= false) boolean typeTest, 
			                     @RequestParam(name = "resetTest", required= false) boolean resetTest,
			                     @RequestParam(name = "exam", required= false) String exam ,Model model) {

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++este es el examen:"+exam);
		numQue = String.valueOf(testService.getTier());
		int porcentaje = (Integer.valueOf(numQue)* 100)/77;
		boolean typeTestLocal; 
		


		ModelAndView mav = new ModelAndView(ViewConstant.JAVA_FORM);
		ArrayList<String> unAnswers = new ArrayList<String>();
		HashMap<String, String> imagen = new HashMap<String, String>();
		HashMap<String, String> examNow = new HashMap<String, String>();
		HashMap<String, Boolean> globalVar = new HashMap<String, Boolean>();
		
		examNow.put("exam", exam);
		
		if(resetTest==true) {
			testService.resetTest();
		}
		
        if(typeTest==false) {
        	
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	unAnswers.add("");
        	
		}else {
			
			unAnswers = testService.getValidAnswers(exam, numQue);
		}
        globalVar.put("variable", typeTest);
        
        if(testService.getImage(exam,numQue)==true) {
        	imagen.put("imagen", "");
        }else {
        	
        	imagen.put("imagen", numQue + ".jpg");
        }
        
		
		imagen.put("valuenow", String.valueOf(porcentaje));
		testService.setQuestionNow(Integer.valueOf(numQue));
		testService.setImage(numQue);
		mav.addObject("review", imagen);
		mav.addObject("question", testService.getQuestion(exam, numQue));

		mav.addObject("response", unAnswers);
		mav.addObject("global", globalVar);
		mav.addObject("exam",examNow);
		testService.setTier(Integer.valueOf(numQue));
		System.out.println("+++++++++++++++++++++++++++++++ numque " + numQue);
		
		
			return mav;
	
	}


	@PostMapping("/test")
	public String workAnswer(@RequestParam(name = "typeTest", required= false) boolean typeTest,
							 @RequestParam(name = "exam", required= false) String exam,
							 @ModelAttribute(name = "answersU") AnswersModel answersModel, Model model) {

		LOG.info("Metodo: que viene de respuestas: " + answersModel.toString());
		ArrayList<String> ansU = new ArrayList<String>();
		ansU.add(String.valueOf(Integer.valueOf(numQue)));

		if ("1".equals(String.valueOf(answersModel.getOptionA()))) {
			ansU.add("A");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionB()))) {
			ansU.add("B");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionC()))) {
			ansU.add("C");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionD()))) {
			ansU.add("D");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionE()))) {
			ansU.add("E");
		}
		if ("1".equals(String.valueOf(answersModel.getOptionF()))) {
			ansU.add("F");
		}

		Boolean resultQuestion = testService.verifyAnswer(Integer.valueOf(numQue), ansU, exam);
		System.out.println("La respuesta es:" + resultQuestion);
		System.out.println("respuestas buenas:" + testService.getSuccess());
		System.out.println("respuestas malas:" + testService.getFails());
		
		int totalQuestion = testService.totalQuestions(exam);
		
		if(numQue.equals(String.valueOf(totalQuestion)) ) {
			
	        return "redirect:/score";
		}
		
		return "redirect:/test?typeTest="+typeTest+"&exam="+exam;

	}
	
	
}
