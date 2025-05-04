package com.tcs.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.userService.entity.UserEntity;
import com.tcs.userService.service.UserService;

@RestController

public class UserController {
    
	@Autowired
	UserService userSer;
	
	@GetMapping("/user")
	public List<UserEntity> findAll()
	{
		return   userSer.getAllUser();
	}
	@GetMapping("/user/{userId}")
	public UserEntity getUserById(@PathVariable String userId)
	{
		return userSer.getUserById(userId);
	}
	 @PostMapping("/user")
	 public void save(@RequestBody UserEntity user)
	 {
		 System.out.println("inside controller");
		 userSer.saveUser(user);
		 System.out.println("after controller");
	 }
}

