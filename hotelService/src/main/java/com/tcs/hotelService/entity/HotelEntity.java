package com.tcs.hotelService.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class HotelEntity {
       @Id
	  @Column(name="id")
	  private String id;
       
       @Column(name="name")
 	  private String name;
       
       @Column(name="location")
 	  private String location;
       
       @Column(name="about")
  	  private String about;
       
       public HotelEntity () {
           this.id = UUID.randomUUID().toString(); // generate a unique ID
       }

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
       
       
}
