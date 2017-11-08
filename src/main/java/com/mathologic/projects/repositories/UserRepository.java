package com.mathologic.projects.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mathologic.projects.models.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
	
                 User findByUsername(@Param("username") String username);	
                 Page<User> findAll(Pageable pagable);

}
