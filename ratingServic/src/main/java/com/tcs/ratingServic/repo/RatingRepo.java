package com.tcs.ratingServic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.ratingServic.entity.RatingEntity;

public interface RatingRepo extends JpaRepository<RatingEntity,String> 
{
	
	//Note :: if i want custom method we should follow rule
	//Rule : findBy ---> ke bad ur column name in cammel case
    public RatingEntity findByUserId(String userId);
    public RatingEntity findByHotelId(String hotelId);
}
