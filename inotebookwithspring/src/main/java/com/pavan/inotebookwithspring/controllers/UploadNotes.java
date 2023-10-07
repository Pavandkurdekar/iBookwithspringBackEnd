package com.pavan.inotebookwithspring.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.User;


@RestController
public class UploadNotes {
    
    @Autowired
    UserRepository userRepository; // Assuming you have a UserRepository
    
    @Autowired
    NotesRepository notesRepository;

    @PostMapping("/uploadnotes")
    String upload(@RequestBody NotesAndUserDTO dto) {
    	
    	
    	String name = dto.getUser().getName();
    	List<User> u = userRepository.findAll();
    
    	for (User u1:u)
    	{
    		if(u1.getName().equals(name))
    		{
    			dto.getNote().setName(name);
    			notesRepository.save(dto.getNote());
    			return "Notes Saved in "+name+"'s repository";
    		}
    		
    	}

    	
    
   return "Unable to Save Notes Due to Wrong Password or Username or User Does not exist";
 
     //notesRepository.saveAll();
    	//return name;
    }
}
