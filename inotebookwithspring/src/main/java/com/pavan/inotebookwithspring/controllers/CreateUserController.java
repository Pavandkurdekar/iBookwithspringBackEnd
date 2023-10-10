package com.pavan.inotebookwithspring.controllers;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.User;

@RestController
@CrossOrigin("http://localhost:3000")

public class CreateUserController 
{
	@Autowired
	UserRepository repo;
	
	
	@PostMapping("/createuser")
	String createuser(@RequestBody User u)
	{
		
		List<User> user = repo.findAll();
		
		for(User user1 : user)
		{
			if(user1.getName().equals(u.getName()))
					{
			return "User With this name Already Exist Please Enter different Name";
					}
		}
		
		repo.save(u);
		
		return u.getName();
		
	}

}
