package com.example.demo.Dao;

import com.example.demo.Entities.User;

public interface UserDao {

	public void InsertUser(User user);
	public User SelectUser(String id) ;
	public void DeleteUser(String id) ;
	public void UpdateUer(User user);
	
}
