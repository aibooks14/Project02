package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/main")
	public String back() {
		return "index" ;
	}
	
	//Need a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form/helloworld-form" ;
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "form/helloworld" ;
	}
	
	//New a Controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Read the request parameter from the HTML form
		String theName = request.getParameter("studentName") ;
		
		//Convert the data to all caps 
		theName = theName.toUpperCase() ;
		
		//Create the message
		String result  ="YO " + theName ;
		
		//add message to the model
		model.addAttribute("message", result) ;
		
		System.out.println(result);
		
		return "form/helloworld" ;
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		//Read the request parameter from the HTML form
//		String theName = request.getParameter("studentName") ;
		
		//Convert the data to all caps 
		theName = theName.toUpperCase() ;
		
		//Create the message
		String result  ="YO! My friend " + theName ;
		
		//add message to the model
		model.addAttribute("message", result) ;
		
		System.out.println(result);
		
		return "form/helloworld" ;
	}
}
