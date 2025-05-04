package com.tcs.hotelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.hotelService.entity.HotelEntity;
import com.tcs.hotelService.repo.HotelRepo;
@Service
public class HotelServiceImp implements HotelService {

	  @Autowired
	  HotelRepo repo;
	@Override
	public void save(HotelEntity entity) {
		// TODO Auto-generated method stub
               repo.save(entity);
	}

	@Override
	public List<HotelEntity> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
