package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.User;
import com.example.demo.Service.UserService;

import antlr.collections.List;

@RestController
public class DemoRest {

	@Autowired
	UserService userservice;
	
	@RequestMapping("/CV/{Id}")
	public User Demo(@PathVariable String Id)
	{
		System.out.println(Id);
	return userservice.SelectUser(Id);
	
	}
	
}
