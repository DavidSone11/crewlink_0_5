//package com.mathologic.projects.mongo.models;
//
//
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//
//import org.springframework.data.annotation.Id;
//
//
////@Document(collection = "UserPlans")
//public class UserPlan implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	private Long id;
//	
//	private LocalDateTime timeStamp = LocalDateTime.now();
//	
//	private String name;
//	
//	private User user;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public LocalDateTime getTimeStamp() {
//		return timeStamp;
//	}
//
//	public void setTimeStamp(LocalDateTime timeStamp) {
//		this.timeStamp = timeStamp;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	
//	
//}
