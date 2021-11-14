package com.example.jenkinsExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsExampleController {

	@GetMapping("/welcome")
	public String method() {
		return "Welcome!";
	}
}
