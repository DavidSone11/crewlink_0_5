/**
 * 
 */
package com.mathologic.projects.mongo.controllers;

/**
 * @author Administrator
 *
 */


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mathologic.projects.mongo.elasticsearch.repositories.MembersRepository;
import com.mathologic.projects.mongo.models.User;

@RestController
@RequestMapping("/api/v1/mongo/elastic/User")
public class MemberMongoController {

	@Autowired
	MembersRepository membersRepository;

	public MemberMongoController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getByname/{name}", method = RequestMethod.GET)
    public List<User> getRecognition(@PathVariable("name") String name){
        return (List<User>) membersRepository.findByusername(name,createPageRequest(0,5,Direction.DESC,"username"));
    }
	

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        //return membersRepository.findAll(createPageRequest(0,5,Direction.DESC,"username"));
		//return membersRepository.findAll();
		
		return null;
    }
	

	private Pageable createPageRequest(int page,int limit,Sort.Direction direction,String sort) {
		return new PageRequest(page, limit,direction, sort);
	}


	public MembersRepository getMembersRepository() {
		return membersRepository;
	}


	public void setMembersRepository(MembersRepository membersRepository) {
		this.membersRepository = membersRepository;
	}

	
	
}
