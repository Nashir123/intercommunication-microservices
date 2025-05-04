package com.tcs.userService.service;

import java.util.List;

import com.tcs.userService.entity.UserEntity;

public interface UserService {
    //user operation
	
	public void saveUser(UserEntity user);
	
	public List<UserEntity>getAllUser();
	public UserEntity getUserById(String userId);
	
}
