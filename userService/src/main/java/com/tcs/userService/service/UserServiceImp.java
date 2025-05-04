package com.tcs.userService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tcs.userService.entity.Rating;
import com.tcs.userService.entity.UserEntity;

import com.tcs.userService.repo.UserRepo;
@Service
public class UserServiceImp implements UserService {
   @Autowired
   UserRepo repo;
   @Autowired
   RestTemplate restTemplate;
	@Override
	public void saveUser(UserEntity user) {
		// TODO Auto-generated method stub
		  System.out.println("inside in user services");
		            
                    repo.save(user);
                    System.out.println("afer servises");
	}

	@Override
	public List<UserEntity> getAllUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public UserEntity getUserById(String userId) {
		Optional<UserEntity> user=repo.findById(userId);
				//orElseThrow(() -> new EntityNotFoundException("Rating not found with id: " +userId));
		
String obj = restTemplate.getForObject("http://localhost:8082/rating/user/fb0f876c-0fd4-472b-b11a-8a75362f2546",String.class);

   //ObjectMapper objectMapper = new ObjectMapper();
String[] parts = obj.split(",");

Rating rating = new Rating();
//rating.setRatingId((parts[0]));
rating.setRating((parts[0].charAt(parts[0].length()-1)-'0'));
rating.setUserId(parts[2]);
rating.setHotelId(parts[1]);
rating.setRemarks(parts[3]);
    
		System.out.println("my rating "+obj);
	      return user.get();
	}

}
