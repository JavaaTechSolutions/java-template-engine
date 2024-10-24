package com.jts.jte;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JteController {
	
	@GetMapping("/")
	public String index(Model model) {
		var  numbers = List.of("1", "2", "3");
		var user = new User("Dummy", "User");
		
		model.addAttribute("msg", "Welcome to Java Template Engine");
		model.addAttribute("numbers", numbers);
		model.addAttribute("user", user);

		return "index";
	}

}
