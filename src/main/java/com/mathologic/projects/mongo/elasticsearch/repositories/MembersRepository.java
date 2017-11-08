/**
 * 
 */
package com.mathologic.projects.mongo.elasticsearch.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.mathologic.projects.mongo.models.User;

/**
 * @author Administrator
 *
 */
public interface MembersRepository extends ElasticsearchRepository<User, String> {
	
	 Page<User> findByusername(String username, Pageable pageable);

	   

}
