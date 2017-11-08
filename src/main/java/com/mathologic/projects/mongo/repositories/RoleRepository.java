//package com.mathologic.projects.mongo.repositories;
/////**
//// * 
//// */
////package com.mathologic.projects.mongo.repositories;
////
/////**
//// * @author Administrator
//// *
//// */
////import org.springframework.data.domain.*;
////import org.springframework.data.repository.*;
////
////import com.mathologic.projects.mongo.models.User;
////
////public interface UserRepository extends Repository<User, Long> {
////
////    Page<User> findAll(Pageable pageable);
////
////    User findByusernameAndPasswordAllIgnoringCase(String name, String country);
////    User findByUsername(String name);
////
////}
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//import com.mathologic.projects.mongo.models.Role;
//import com.mathologic.projects.mongo.models.User;
//
////@RepositoryRestResource(collectionResourceRel = "log", path = "log")
////public interface RoleRepository extends PagingAndSortingRepository<Role, String>, 
////                                       LogRepositoryCustom {
//
//
//	public interface RoleRepository extends PagingAndSortingRepository<Role, String> {
//
//    @Query("select r from Role r where r.id=-5a03183837add878af38902e")
//    Page<Role> findAllFilter(@Param("options") String options,
//        @Param("eid") Long[] entityIds,
//        @Param("class") String cls,
//        Pageable pageable);
//
//	/**
//	 * @param username
//	 * @return
//	 */
//	Role findBynameAllIgnoringCase(String username);
//
//	/**
//	 * @param name
//	 * @return
//	 */
//	List<Role> findByname(String name);
//
//	/**
//	 * @param username
//	 * @return
//	 */
//
//}
//
//// interface LogRepositoryCustom {
////
////    Page<Log> findAllFilter(@Param("options") String options,
////        @Param("eid") Long[] entityIds,
////        @Param("class") String cls,
////        Pageable pageable);
////}