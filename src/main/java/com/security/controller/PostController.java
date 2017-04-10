package com.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@RequestMapping("/posts/")
	public String listar(){
		return "listar posts";
	}
	
	@RequestMapping("/admin/posts/new")
	public String addPost() {
		return "add Post...";
	}
}
