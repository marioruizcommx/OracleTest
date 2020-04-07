package com.gym.Certifications.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gym.Certifications.constant.ViewConstant;
import com.gym.Certifications.service.TestService;



@Controller
public class ScoreController {
	
	@Autowired
	@Qualifier("TestServiceImpl")
	private TestService testService;
	
	@GetMapping("/score")
	public ModelAndView scoreFinal() {
		ModelAndView mav = new ModelAndView(ViewConstant.SCORE_FINAL);
		HashMap<String, String> scoreFinal = new HashMap<String, String>();
		HashMap<String, String> totalQuestions = new HashMap<String, String>();
		int totalQuestion = testService.totalQuestions("1z0-808");
		totalQuestions.put("totalQuestion", String.valueOf(totalQuestion));
		scoreFinal.put("score",String.valueOf( testService.calculateScore("1z0-808")));
		mav.addObject("review", scoreFinal);
		mav.addObject("totalQuestion", totalQuestions);
		return mav;
		
	}
	
	@GetMapping("/getout")
	public String getOut() {
		testService.resetTest();
		return "redirect:/menu-secundary";	
	}

}
