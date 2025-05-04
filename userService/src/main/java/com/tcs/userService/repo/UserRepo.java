package com.tcs.userService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.userService.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,String> {

}
