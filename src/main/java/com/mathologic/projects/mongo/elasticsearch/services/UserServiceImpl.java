/**
 * 
 */
package com.mathologic.projects.mongo.elasticsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mathologic.projects.mongo.elasticsearch.repositories.MembersRepository;
import com.mathologic.projects.mongo.models.User;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

    private MembersRepository membersRepository;

	/* (non-Javadoc)
	 * @see com.mathologic.projects.mongo.elasticsearch.services.UserService#save(com.mathologic.projects.mongo.models.User)
	 */
	@Override
	public User save(User user) {
		return membersRepository.save(user);
	}

	/* (non-Javadoc)
	 * @see com.mathologic.projects.mongo.elasticsearch.services.UserService#delete(com.mathologic.projects.mongo.models.User)
	 */
	@Override
	public void delete(User user) {
		membersRepository.delete(user);
		
	}

	/* (non-Javadoc)
	 * @see com.mathologic.projects.mongo.elasticsearch.services.UserService#findOne(java.lang.String)
	 */
	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return membersRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.mathologic.projects.mongo.elasticsearch.services.UserService#findAll()
	 */
	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return membersRepository.findAll();
	}

	
	

	public MembersRepository getMembersRepository() {
		return membersRepository;
	}
	@Autowired
	public void setMembersRepository(MembersRepository membersRepository) {
		this.membersRepository = membersRepository;
	}

	/* (non-Javadoc)
	 * @see com.mathologic.projects.mongo.elasticsearch.services.UserService#findByusername(java.lang.String, org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<User> findByusername(String name, PageRequest pageRequest) {
		
		return membersRepository.findByusername(name, pageRequest);
	}

   


  


}
