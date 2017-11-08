package com.mathologic.projects.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mathologic.projects.models.Station;





@RepositoryRestResource
public interface StationRepository extends JpaRepository<Station, Long>{
	
	  @Query("SELECT s from Station as s where (s.code LIKE %:code% OR :code IS NULL OR code is '%%') AND (s.name LIKE %:name% OR :name IS NULL OR name is '%%')")
	 Page<Station> findByAllStationsParams(@Param("code")String code,@Param("name")String name,Pageable pagable);

}
