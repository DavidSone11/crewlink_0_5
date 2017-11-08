//package com.mathologic.projects.mongo.models;
//
//import java.io.Serializable;
//import java.util.LinkedList;
//import java.util.List;
//
//import javax.persistence.Id;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//
//
//@Document(collection = "TrainTypes")
//public class TrainType implements Serializable {
//private static final long serialVersionUID = 1L;
//	
//	@Id
//	private Long id;
//	
//	private String name;
//	
//	private List<Train> trains = new LinkedList<Train>();
//	
////	@ManyToMany
////	private List<CrewType> crewTypes = new LinkedList<CrewType>();
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
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
//	public List<Train> getTrains() {
//		return trains;
//	}
//
//	public void setTrains(List<Train> trains) {
//		this.trains = trains;
//	}
//
//
//}
