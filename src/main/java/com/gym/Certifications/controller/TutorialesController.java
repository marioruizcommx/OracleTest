package com.gym.Certifications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TutorialesController {
	
	@GetMapping("/tutoriales")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView();
		return mav;
		
	}

}
