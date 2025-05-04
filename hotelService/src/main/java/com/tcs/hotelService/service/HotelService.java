package com.tcs.hotelService.service;

import java.util.List;

import com.tcs.hotelService.entity.HotelEntity;

public interface HotelService {
     public void save(HotelEntity entity);
     public List<HotelEntity> getAll();
}
