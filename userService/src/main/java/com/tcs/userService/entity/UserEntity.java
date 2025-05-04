package com.tcs.userService.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="updatedUser")
public class UserEntity {
	
	  @Id
      private String id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userMobile")
	private String userMobile;
	@Column(name="userAdhar")
	private String userAdhar;

   @Transient
    private List<Rating> ratings= new ArrayList<>();
   
	public UserEntity () {
         this.id = UUID.randomUUID().toString(); // generate a unique ID
     }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserAdhar() {
		return userAdhar;
	}
	public void setUserAdhar(String userAdhar) {
		this.userAdhar = userAdhar;
	}

	
	
               
}

