/**
 * 
 */
package com.mathologic.projects.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mathologic.projects.models.User;


/**
 * @author SANTOSH
 *
 */
@Repository
public interface UserCrudRepository extends CrudRepository<User, Long>{



}
