package com.tcs.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.hotelService.entity.HotelEntity;
import com.tcs.hotelService.service.HotelService;

@RestController
public class HotelController {
        
	@Autowired
	HotelService service;
	
	@PostMapping("/hotel")
	public void saveVal(@RequestBody HotelEntity entity)
	{
		service.save(entity);
	}
	
	@GetMapping("/hotel")
	public List<HotelEntity> getAllVal()
	{
		return service.getAll();
	}
	
	
}
