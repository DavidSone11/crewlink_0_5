/**
 * 
 */
package com.mathologic.projects.mongo.elasticsearch.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.mathologic.projects.mongo.models.User;

/**
 * @author Administrator
 *
 */
public interface UserService {

	User save(User user);

	void delete(User user);

	User findOne(String id);

	Iterable<User> findAll();

	Page<User> findByusername(String name, PageRequest pageRequest);

	

}
