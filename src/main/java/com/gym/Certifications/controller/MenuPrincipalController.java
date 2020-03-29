package com.gym.Certifications.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gym.Certifications.constant.ViewConstant;
import com.gym.Certifications.entity.Exams;
import com.gym.Certifications.model.ExamModel;
import com.gym.Certifications.service.TechService;
import com.gym.Certifications.service.TestService;



@Controller
public class MenuPrincipalController {
	
	@Autowired
	@Qualifier("techServiceImpl")
	private TechService techService;
	
	
	@GetMapping("/menu-principal")
	public ModelAndView getMenuPrincipal(){
		ModelAndView mav = new ModelAndView(ViewConstant.MENU_PRINCIPAL);
		mav.addObject("techs", techService.listAllTech());

		return mav;
	}
	

}
