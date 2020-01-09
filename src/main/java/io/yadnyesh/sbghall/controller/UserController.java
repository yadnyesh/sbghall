package io.yadnyesh.sbghall.controller;

import io.yadnyesh.sbghall.model.User;
import io.yadnyesh.sbghall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	public UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/list")
	public Iterable<User> listUsers() {
		return userService.list();
	}
	
}
