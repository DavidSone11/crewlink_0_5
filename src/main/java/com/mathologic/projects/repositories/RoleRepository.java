package com.mathologic.projects.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mathologic.projects.models.Role;


@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	
	
	  @Query("SELECT r from Role as r where (r.name LIKE %:name% OR :name IS NULL OR name is '%%')")
	 Page<Role> findByAllRoleParams(@Param("name")String name,Pageable pagable);
	
                 

}
