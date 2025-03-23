package com.javatechie.springboot.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}
	
	/*
	 * echo "# githubactions" >> README.md git init git add README.md git commit -m
	 * "first commit" git branch -M main git remote add origin
	 * https://github.com/fareedha199/githubactions.git git push -u origin main
	 */

}
