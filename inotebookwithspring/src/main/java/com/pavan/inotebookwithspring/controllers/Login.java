package com.pavan.inotebookwithspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;

import com.pavan.inotebookwithspring.models.User;

@RestController
@CrossOrigin("http://localhost:3000")
public class Login 

{
	

	@Autowired
	UserRepository repo;
	
	@Autowired
	NotesRepository noterepo;
	
	
	@PostMapping("/login")
	String login(@RequestBody User user) {
		
		List<User> us = repo.findAll();
		

		//List<User> us = repo.findAll();
		
		for(User u : us)
		{
			if(u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword()))
			{
				//List<Notes> n = noterepo.findAllByName(name);
				//System.out.println(n);
				return "Login Successfull";
			
		
			               
		}
			
			
		}
		return "Wrong Password or Email";
		
	}
	
	

}
