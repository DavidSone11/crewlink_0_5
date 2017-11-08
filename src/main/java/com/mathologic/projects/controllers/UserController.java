package com.mathologic.projects.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathologic.projects.models.User;
import com.mathologic.projects.repositories.UserRepository;




@RestController
@RequestMapping("api/v1/User")
public class UserController {

	@Autowired
	UserRepository userRepository;

	

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/getUsername", method = RequestMethod.GET)
	public Page<User> getUserInfo(@RequestParam(value = "username", required = false) String username) {
		User user = userRepository.findByUsername(username);
		//Page<User> UsersList = userRepository.findAll(createPageRequest());
		System.out.print(user);
		return null;
	}

	private Pageable createPageRequest() {
		return new PageRequest(0, 10, Sort.Direction.ASC, "username");
	}

	

}
