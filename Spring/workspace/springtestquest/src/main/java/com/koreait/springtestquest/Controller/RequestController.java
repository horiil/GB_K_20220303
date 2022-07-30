package com.koreait.springtestquest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class RequestController {
	
	//1번
	@GetMapping("/home")
	public String home() {
		return "param/home";
	}
	
	//2번
	@GetMapping("/get")
	public String Get(@RequestParam(name = "answer") int ans, Model model) {
		String result = null;
		
		if( ans == 300 ) {
			result = "정답입니다."; 
		} else {
			result = "오답입니다.";
		}
		
		model.addAttribute("answer", ans);
		model.addAttribute("result", result);
		
		return "param/getresult";
	}

	
	//3번
	@PostMapping("/post")
	public String Post(@RequestParam (name = "user_name" , defaultValue = "guest") String u_name, 
						@RequestParam (name = "user_age", defaultValue = "-1")int u_age, Model model) {
		model.addAttribute("user_name", u_name);
		model.addAttribute("user_age", u_age);
		
		return "param/postresult";
	}
}
