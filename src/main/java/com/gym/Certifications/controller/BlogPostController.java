package com.gym.Certifications.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogPostController {
	
	@GetMapping("/blog-post")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView();
		return mav;
		
	}

}
