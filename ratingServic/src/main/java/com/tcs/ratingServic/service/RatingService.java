package com.tcs.ratingServic.service;

import java.util.List;

import com.tcs.ratingServic.entity.RatingEntity;

public interface RatingService {
     public void saveRating(RatingEntity rating);
     public List<RatingEntity> findAll();
     public RatingEntity findByUserId(String userId);
     public RatingEntity findByHotelId(String hotelId);
    
}
