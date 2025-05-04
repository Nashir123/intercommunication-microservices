package com.tcs.userService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
   private String ratingId;
   private int rating;
   private String userId;
   private String hotelId;
   private String remarks;
   
public String getRatingId() {
	return ratingId;
}

public void setRatingId(String ratingId) {
	this.ratingId = ratingId;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getHotelId() {
	return hotelId;
}

public void setHotelId(String hotelId) {
	this.hotelId = hotelId;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}

@Override
public String toString() {
	return "Rating [ratingId=" + ratingId + ", rating=" + rating + ", userId=" + userId + ", hotelId=" + hotelId
			+ ", remarks=" + remarks + "]";
}
   
   
}
