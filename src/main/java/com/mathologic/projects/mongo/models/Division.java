//package com.mathologic.projects.mongo.models;
//
///**
// * 
// */
//
//
//import java.io.Serializable;
//import java.util.LinkedList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//
///**
// * @author avitash
// *
// */
//
//@Document(collection = "divisions")
//public class Division implements Serializable{
//	
//	private static final long serialVersionUID = 1L;
//
//	@Id
//    private Long id;
//	
//	@NotNull
//	@Column(unique=true)
//	private String name;
//	
//	private List<Station> stations = new LinkedList<Station>();
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
//	public List<Station> getStations() {
//		return stations;
//	}
//
//	public void setStations(List<Station> stations) {
//		this.stations = stations;
//	}
//}
