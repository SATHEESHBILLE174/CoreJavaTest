package com.controllers.sageItTraining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pojos.sageItTraining.Employee;
import com.pojos.sageItTraining.Language;
import com.service.sageItTraining.LanguageService;

@RestController
public class LanguageController {

	@Autowired
	LanguageService languageService;

	
	  @RequestMapping("/Employees/{empId}/languages") 
	 
	  public List<Language> getAllTheLanguages(@PathVariable String empId) { 
		  return languageService.getAllLanguages(empId);
			  }
	 
	@RequestMapping("/Employees/{empId}/Languages/{languageId}")
	public Language getLanguage(@PathVariable String languageId) {
		return languageService.getLanguage(languageId);
	}


	
	@RequestMapping(method = RequestMethod.POST, value = "/employees/{empId}/Languages")
	public void addCourse(@RequestBody Language language, @PathVariable String  empId) {
		language.setEmployee(new Employee(empId,"pavan",88373621,55000.0f,"dxc"));
		languageService.addLaguage(language);   // calling service method for business logic 
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/Employees/{empId}/Languages/{id}")
	public void updateLanguage(@RequestBody Language language,@PathVariable String empId, @PathVariable String id) {
		
		language.setEmployee(new Employee(empId,"naresh",88373621,55000.0f,"dxc"));
		languageService.updateLaguage(language);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/Employees/{empId}/Languages/{id}")
	public void deleteLanguage(@PathVariable String id) {
		languageService.deleteLanguage(id);
	}


}
