package com.tcs.userService.ratingDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class RatingDTO {
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
	  
}
