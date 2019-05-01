package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/aws")
public class HelloWorld {
		@GetMapping(value="/welcome")
		public String helloWorld() {
			return "Hello welcome to AWS Cloud....";
		}
}
