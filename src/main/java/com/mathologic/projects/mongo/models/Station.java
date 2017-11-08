//package com.mathologic.projects.mongo.models;
//
//
//
//import java.io.Serializable;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "Stations")
//public class Station implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	private Long id;
//
//	private String code;
//
//	private String name;
//
//	private Long headStationSignOnDuration = 30L;
//
//	private Long headStationSignOffDuration= 30L;
//	
//	private Integer numberOfBeds= 1;
//
//	private Long outStationSignOnDuration= 30L;
//
//	private Long outStationSignOffDuration= 30L;
//	
//	
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
//	public String getCode() {
//		return code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
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
//	public Long getHeadStationSignOnDuration() {
//		return headStationSignOnDuration;
//	}
//
//	public void setHeadStationSignOnDuration(Long headStationSignOnDuration) {
//		this.headStationSignOnDuration = headStationSignOnDuration;
//	}
//
//	public Long getHeadStationSignOffDuration() {
//		return headStationSignOffDuration;
//	}
//
//	public void setHeadStationSignOffDuration(Long headStationSignOffDuration) {
//		this.headStationSignOffDuration = headStationSignOffDuration;
//	}
//
//	public Integer getNumberOfBeds() {
//		return numberOfBeds;
//	}
//
//	public void setNumberOfBeds(Integer numberOfBeds) {
//		this.numberOfBeds = numberOfBeds;
//	}
//
//	public Long getOutStationSignOnDuration() {
//		return outStationSignOnDuration;
//	}
//
//	public void setOutStationSignOnDuration(Long outStationSignOnDuration) {
//		this.outStationSignOnDuration = outStationSignOnDuration;
//	}
//
//	public Long getOutStationSignOffDuration() {
//		return outStationSignOffDuration;
//	}
//
//	public void setOutStationSignOffDuration(Long outStationSignOffDuration) {
//		this.outStationSignOffDuration = outStationSignOffDuration;
//	}
//
//
//}
