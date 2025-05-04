package com.tcs.ratingServic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ratingServic.entity.RatingEntity;
import com.tcs.ratingServic.service.RatingService;

@RestController
public class RatingController {
    @Autowired
    RatingService service;
    
    @GetMapping("/rating")
    public List<RatingEntity>findRating()
    {
    	return service.findAll();
    }
    
    @PostMapping("/rating")
    public void saveRating(@RequestBody RatingEntity entity)
    {
    	 service.saveRating(entity);
    }
    
    @GetMapping("/rating/user/{userId}")
    public  RatingEntity getRatingByUserId(@PathVariable String userId)
    {
    	return service.findByUserId(userId);
    }
    @GetMapping("/rating/hotel/{hotelId}")
    public  RatingEntity getRatingByhotelId(@PathVariable String hotelId)
    {
    	return service.findByHotelId(hotelId);
    }
}
