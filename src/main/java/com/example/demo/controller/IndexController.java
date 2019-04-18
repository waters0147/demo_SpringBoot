package com.example.demo.controller;
import com.example.demo.repository.activityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class IndexController {

	@Autowired
	private activityRepository repository;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView=new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}


	@GetMapping("admin")
	public String admin(){
		return "admin";
	}

	@GetMapping("/user")
	public String user() {
		return "/user";
	}

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

}