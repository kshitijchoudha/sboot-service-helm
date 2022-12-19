package com.example.springboothelm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/")
	public String greeting() {
		return "Greetings!! this is sboot with helm";
	}

    @RequestMapping("/hello")
	public String greetings() {
		return "Hello!! sboot with helm";
	}

}