package com.tcs.hotelService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.hotelService.entity.HotelEntity;

public interface HotelRepo extends JpaRepository<HotelEntity,String> {
  
}
