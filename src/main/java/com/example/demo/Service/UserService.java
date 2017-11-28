package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserDao;
import com.example.demo.Entities.User;

@Service
public class UserService {

	@Autowired
	UserDao userdao;

    public void InsertUser(User user) {

        userdao.InsertUser(user);
    }

    public User SelectUser(String Id) {
 
    	return userdao.SelectUser(Id);

    }

    public void DeleteUser(String Id) {
    userdao.DeleteUser(Id);
    }

    public void UpdateUser(User user) {
          userdao.UpdateUer(user);
 
    }
  
}
