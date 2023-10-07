 package com.pavan.inotebookwithspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.Notes;
import com.pavan.inotebookwithspring.models.User;

@RestController
public class LoginUser 
{
	@Autowired
	UserRepository repo;
	
	@Autowired
	NotesRepository noterepo;
	
	
	@PostMapping("/loginuser")
	List<Notes> Login(@RequestBody User user)
	{
		
		List<User> us = repo.findAll();
		
		for(User u : us)
		{
			if(u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword()))
			{
				List<Notes> n = noterepo.findAllByName(user.getName());
				return n;
			
				
			               
		}
			
			}
		//return "Login Failed!";
		return null;
		
		
		
	
		
		
	}
	
	
}
