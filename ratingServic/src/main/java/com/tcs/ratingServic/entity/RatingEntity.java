package com.tcs.ratingServic.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="updatedRating")
public class RatingEntity {
	
	   @Id
	  @Column(name="id")
	  private String id;
         
	  @Column(name="rating") 
	  int rating;
	  @Column(name="hotelId")
	  String hotelId;
	  @Column(name="userId")
	  String userId;
	  @Column(name="feedback")
	  String feedback;
	  



	public int getRating() {
		return rating;
	}




	public void setRating(int rating) {
		this.rating = rating;
	}




	public String getHotelId() {
		return hotelId;
	}




	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getFeedback() {
		return feedback;
	}




	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}




	public RatingEntity() {
           this.id = UUID.randomUUID().toString(); // generate a unique ID
       }  
}
