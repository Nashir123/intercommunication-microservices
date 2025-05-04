package com.tcs.ratingServic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.ratingServic.entity.RatingEntity;
import com.tcs.ratingServic.repo.RatingRepo;

import jakarta.persistence.EntityNotFoundException;
@Service
public class RatingServiceImp implements RatingService {
    @Autowired
    RatingRepo repo;
   
	@Override
	public void saveRating(RatingEntity rating) {
		// TODO Auto-generated method stub
             repo.save(rating);
	}

	@Override
	public List<RatingEntity> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public RatingEntity findByUserId(String userId) {
		// TODO Auto-generated method stub
      RatingEntity rating =repo.findByUserId(userId);
      //orElseThrow(() -> new EntityNotFoundException("Rating not found with id: " +userId)); 
      return rating;
	}

	@Override
	public RatingEntity findByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		 RatingEntity rating =repo.findByHotelId(hotelId);
		 //orElseThrow(() -> new EntityNotFoundException("Rating not found with id: " +hotelId));
	      return rating;
	}

}
