package com.gym.Certifications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RoboticsController {

		
		@GetMapping("/robotics")
		public ModelAndView getIndex() {
			ModelAndView mav = new ModelAndView();
			return mav;
			
		}

	}