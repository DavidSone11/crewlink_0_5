package com.mathologic.projects.mongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathologic.projects.mongo.models.Role;
import com.mathologic.projects.mongo.models.User;
import com.mathologic.projects.mongo.repositories.UsersRepository;

@RestController
@RequestMapping("/api/v1/mongo/User")
public class UserMongoController {

	@Autowired
	UsersRepository userRepository;

	public UserMongoController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getByname/{name}", method = RequestMethod.GET)
    public List<User> getRecognition(@PathVariable("name") String name){
        return (List<User>) userRepository.findByUsername(name);
    }

	@RequestMapping(value = "/getAllRoles", method = RequestMethod.GET)
    public Page<User> getAllUsers(){
        return userRepository.findAll(createPageRequest(0,5,Direction.DESC,"username"));
    }
	@RequestMapping(value = "/getByUsernameAndPassword", method = RequestMethod.GET)
	public Page<User> getUsers(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		User user = userRepository.findByUsernameAndPasswordAllIgnoringCase(username, password);
		return null;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestBody User user) {
		
		if(user!=null) {
			userRepository.save(user);
		}

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	private Pageable createPageRequest(int page,int limit,Sort.Direction direction,String sort) {
		return new PageRequest(page, limit,direction, sort);
	}

	
	@DeleteMapping("/remove/{name}")
	public ResponseEntity<String> deleteRole(@PathVariable String name) {
		List<User> users = userRepository.findByUsername(name);
		if (users.size() == 1) {
			User user = users.get(0);
			userRepository.delete(user);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	@RequestMapping(value = "/update/{name}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@PathVariable String name) {
		List<User> users = (List<User>) userRepository.findByUsername(name);
		if (users.size() == 1) {
			User user = users.get(0);
			userRepository.delete(user);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
