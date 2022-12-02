package com.madhavi.springboot.applicantmanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.madhavi.springboot.applicantmanagement.model.Applicant;
import com.madhavi.springboot.applicantmanagement.service.ApplicantService;

@Controller
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;	

	@RequestMapping(value = "/list-applicants", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.put("applicants", applicantService.allApplicants());
		return "list-applicants";
	}
	@RequestMapping(value = "/register-applicant", method = RequestMethod.GET)
	public String registerApplicant(ModelMap model) {
		
		return "register";
	}
	@RequestMapping(value = "/delete-applicant", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam long id) {
		applicantService.deleteApplicant(id);
		// service.deleteTodo(id);
		return "redirect:/list-applicants";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateApplicant(ModelMap model,@RequestParam long id) {
		model.put("applicant", applicantService.getApplicantById(id).get());		
		return "register";
	}
	@RequestMapping(value = "/update-applicant", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Applicant applicant, BindingResult result) {		
		applicantService.updateApplicant(applicant);
		return "redirect:/list-applicants";
	}

	@RequestMapping(value = "/add-applicant", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Applicant applicant, BindingResult result) {	
		applicantService.saveApplicant(applicant);
		return "redirect:/list-applicants";
	}
}
