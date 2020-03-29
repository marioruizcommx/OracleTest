package com.gym.Certifications.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
		scoreFinal.put("score",String.valueOf( testService.calculateScore()));
		mav.addObject("review", scoreFinal);
		return mav;
		
	}
	
	@GetMapping("/getout")
	public String getOut() {
		testService.resetTest();
		return "redirect:/menu-secundary";	
	}

}
