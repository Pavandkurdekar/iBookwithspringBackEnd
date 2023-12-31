 package com.pavan.inotebookwithspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.Notes;
import com.pavan.inotebookwithspring.models.User;

@RestController
@CrossOrigin("http://localhost:3000")
public class LoginUser 
{
	@Autowired
	UserRepository repo;
	
	@Autowired
	NotesRepository noterepo;
	
	
	@GetMapping("/getnotes/{name}")
	List<Notes> Login(@PathVariable String name)
	{
		System.out.println("Recived request to display notes");
		
		List<User> us = repo.findAll();
		
		for(User u : us)
		{
			if(u.getName().equals(name) )
			{
				List<Notes> n = noterepo.findAllByName(name);
				//System.out.println(n);
				return n;
			
			
			               
		}
			
			
		}
		//return "Login Failed!";
		return null;
		
		
		
	
		
		
	}
	
	
}
