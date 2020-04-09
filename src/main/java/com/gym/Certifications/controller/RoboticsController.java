package com.gym.Certifications.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RoboticsController {

		
		@GetMapping("/robotics")
		public ModelAndView getIndex() {
			ModelAndView mav = new ModelAndView();
			return mav;
			
		}
		
		@GetMapping("/validate-key")
		public String updateJuridiccion(@RequestParam(name = "key", required= false) Integer key ,Model model) {
			//
			System.out.println("--------------------------"+key);
			
			if (key == null) {
				key=1427538;
			}
			
			if(key==142753869) {
				//return "redirect:/robotics";
				return "redirect:/assets/docs/arduinok545_tinkercad.brd";
				
			}else {
				return "redirect:/assets/docs/arduinok545_tinkercad.brd";
				
			}

		}

	}