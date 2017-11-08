//package com.mathologic.projects.mongo.models;
//
//
//
//import java.io.Serializable;
//import java.util.LinkedList;
//import java.util.List;
//
//import javax.persistence.FetchType;
//import javax.persistence.ManyToMany;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@Document(collection = "Trains")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//public class Train implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//
//
//	@Id
//	private Long id;
//
//	
//	private Integer trainNo;
//	
//	// Monday, Tuesday, etc.
//	
//	private Day startDay;
//
//	private String name;
//
//	private Station fromStation;
//	
//	private Station toStation;
//	
//	private TrainType trainType;
//	
//	private List<TrainStation> trainStations = new LinkedList<TrainStation>();
//	
//
//	@ManyToMany(mappedBy="trains", fetch = FetchType.LAZY)
//	private List<User> users = new LinkedList<User>();
//	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Integer getTrainNo() {
//		return trainNo;
//	}
//
//	public void setTrainNo(Integer trainNo) {
//		this.trainNo = trainNo;
//	}
//
//	public Day getStartDay() {
//		return startDay;
//	}
//
//	public void setStartDay(Day startDay) {
//		this.startDay = startDay;
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
//	public Station getFromStation() {
//		return fromStation;
//	}
//
//	public void setFromStation(Station fromStation) {
//		this.fromStation = fromStation;
//	}
//
//	public Station getToStation() {
//		return toStation;
//	}
//
//	public void setToStation(Station toStation) {
//		this.toStation = toStation;
//	}
//
//	public TrainType getTrainType() {
//		return trainType;
//	}
//
//	public void setTrainType(TrainType trainType) {
//		this.trainType = trainType;
//	}
//
//	public List<TrainStation> getTrainStations() {
//		return trainStations;
//	}
//
//	public void setTrainStations(List<TrainStation> trainStations) {
//		this.trainStations = trainStations;
//	}
//
//	
//
//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
//	
//}
