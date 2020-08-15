package com.gnb.gmart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to jenkins pipeline-CI/CD/Docker/k8s/sonar";
	}

}
