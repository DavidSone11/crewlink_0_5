package com.mathologic.projects.mongo.elasticsearch.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mathologic.projects.mongo.models.User;

public interface UsersRepository extends MongoRepository<User, Long>{
	Page<User> findAll(Pageable pageable);
	List<User> findByUsername(String username);
	User findByUsernameAndPasswordAllIgnoringCase(String username, String password);

}