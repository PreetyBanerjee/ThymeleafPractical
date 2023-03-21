package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler...");
		
		//putting data in model
		model.addAttribute("name","preety");
		model.addAttribute("currentDate",new Date().toLocaleString());
		
		//example
		String nameString="abc";
		nameString.toUpperCase();
		
		//about.html
		return "about";
		
	}
	
	// handling iteration
	@GetMapping("/example-loop")
	public String iterateHAndler(Model m) {
		//send
		
		//create a list,map,set collection
		List<String> names=List.of("Ankit","Laxmi","Karan","John");
		
		m.addAttribute("names",names);
		
		return "iterate";
	}
	
	//handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("conditional handler executed...");
		m.addAttribute("isActive",true);
		m.addAttribute("gender","F");
		List<Integer> list=List.of(233,43,53,6456,64);
		m.addAttribute("mylist",list);
		return "condition";
	}
	
	//handler for including fragment
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title","I like to eat samosa");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}
	
	//for new about
	@GetMapping("/aboutnew")
	public String newAbout() {
		return "aboutNew";
	}
	
	//for contact
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
