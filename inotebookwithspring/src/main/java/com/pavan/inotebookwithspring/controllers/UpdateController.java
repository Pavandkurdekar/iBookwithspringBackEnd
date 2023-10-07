package com.pavan.inotebookwithspring.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.Notes;

@RestController
public class UpdateController {
	
	
	@Autowired
	NotesRepository nrep;
	
	@Autowired
	UserRepository urep;
	
	
	
	@PutMapping("/editnotes/{id}")
	String editnotes(@RequestBody Notes note, @PathVariable  Long id )
	{
	    Optional<Notes> note1 = nrep.findById(id);
	    if(note1.isPresent())
	    {
	    	Notes note2=note1.get();
	    	note2.setTitle(note.getTitle());
	    	note2.setDescription(note.getDescription());
	    	note2.setDate(note.getDate());
	    	//note2.setId(note.getId());
	 
			nrep.save(note2);
			return  "Old Notes Updated";
	    }
		
		return "Notes Not found with the id "+id;
	}
	

}
