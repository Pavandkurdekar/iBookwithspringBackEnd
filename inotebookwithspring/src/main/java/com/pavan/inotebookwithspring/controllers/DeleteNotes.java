package com.pavan.inotebookwithspring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.inotebookwithspring.Repository.NotesRepository;
import com.pavan.inotebookwithspring.Repository.UserRepository;
import com.pavan.inotebookwithspring.models.Notes;

@RestController
public class DeleteNotes {
	
	

	@Autowired
	NotesRepository nrep;
	
	@Autowired
	UserRepository urep;
	
	
	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable Long id)
	{
		Optional<Notes> note = nrep.findById(id);
		
		if(note.isPresent())
		{
			nrep.deleteById(id);
			return "Note with the id "+id+" Got Deleted Successfully! ";
		}
		
		return "Note With the id "+id+  " Doesnt exist";
		
	}

	
	
	
	
}
