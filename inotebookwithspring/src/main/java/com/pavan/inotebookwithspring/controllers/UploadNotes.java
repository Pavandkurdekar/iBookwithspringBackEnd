package com.pavan.inotebookwithspring.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class UploadNotes {
    
    @Autowired
    UserRepository userRepository; // Assuming you have a UserRepository
    
    @Autowired
    NotesRepository notesRepository;

    @PostMapping("/uploadnotes/{name}")
    String upload(@RequestBody Notes note, @PathVariable String name) {
    	
    	// System.out.println("Received a request to upload notes for uname: " + name);
    	  //  System.out.println("Note received: " + note.toString());

    	//String name = user.getName();
    	//String pass = user.getPassword();
    	List<User> u = userRepository.findAll();
    
    	for (User u1:u)
    	{
    		if(u1.getName().equals(name) )
    		{
    			note.setName(name);
    			notesRepository.save(note);
    			return "Notes Saved in "+name+"'s repository";
    		}
    		
    	}

    	
    
   return "Unable to Save Notes Due to Wrong Username or User Does not exist";
 
     //notesRepository.saveAll();
    	//return name;
    }
}
