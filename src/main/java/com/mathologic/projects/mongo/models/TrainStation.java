//package com.mathologic.projects.mongo.models;
//
//import java.io.Serializable;
//
//
//import java.time.LocalTime;
//import javax.persistence.Column;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.validation.constraints.NotNull;
//
////@Document(collection = "TrainStations")
//public class TrainStation implements Serializable {
//
//	public TrainStation() {
//	}
//	
//	private static final long serialVersionUID = 1L;
//
//	@Id
//    private Long id;
//
//   
//
//    private Integer stopNumber;
//
//    @ManyToOne
//    private Station station;
//    
//    @NotNull
//    private LocalTime arrivalTime;
//
//    @NotNull
//    private LocalTime departureTime;
//
//    @NotNull
//    @Enumerated(EnumType.ORDINAL)
//	private Day day;
//    
//    @NotNull
//    private Integer dayOfJourney;
//
//    @NotNull
//    private Long distance;
//
//    @NotNull
//    private Long journeyDuration;
//    
//   
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Train getTrain() {
//		return train;
//	}
//
//	public void setTrain(Train train) {
//		this.train = train;
//	}
//
//	public Integer getStopNumber() {
//		return stopNumber;
//	}
//
//	public void setStopNumber(Integer stopNumber) {
//		this.stopNumber = stopNumber;
//	}
//
//	public Station getStation() {
//		return station;
//	}
//
//	public void setStation(Station station) {
//		this.station = station;
//	}
//
//
//
//	public Integer getDayOfJourney() {
//		return dayOfJourney;
//	}
//
//	public void setDayOfJourney(Integer dayOfJourney) {
//		this.dayOfJourney = dayOfJourney;
//	}
//
//	public Long getDistance() {
//		return distance;
//	}
//
//	public void setDistance(Long distance) {
//		this.distance = distance;
//	}
//
//	public Long getJourneyDuration() {
//		return journeyDuration;
//	}
//
//	public void setJourneyDuration(Long journeyDuration) {
//		this.journeyDuration = journeyDuration;
//	}
//
//	public Day getDay() {
//		return day;
//	}
//
//	public void setDay(Day day) {
//		this.day = day;
//	}
//
//	public LocalTime getArrivalTime() {
//		return arrivalTime;
//	}
//
//	public void setArrivalTime(LocalTime arrivalTime) {
//		this.arrivalTime = arrivalTime;
//	}
//
//	public LocalTime getDepartureTime() {
//		return departureTime;
//	}
//
//	public void setDepartureTime(LocalTime departureTime) {
//		this.departureTime = departureTime;
//	}
//
//	
//
//}
