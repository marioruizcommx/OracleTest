package com.gym.Certifications.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.Certifications.constant.ViewConstant;
import com.gym.Certifications.service.TechService;



@Controller
public class MenuSecundaryController {

	@Autowired
	@Qualifier("techServiceImpl")
	private TechService techService;
	
	
	@GetMapping("/menu-secundary")
	public ModelAndView scoreFinal() {
		ModelAndView mav = new ModelAndView(ViewConstant.MENU_SECUNDARY);
		mav.addObject("techs", techService.listAllTech());
		return mav;
		
	}

}
