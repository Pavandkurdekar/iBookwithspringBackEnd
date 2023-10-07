package com.pavan.inotebookwithspring.Repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.inotebookwithspring.models.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {

	List<Notes> findAllByName(String name);

	

	
	//List<Notes> findAllByUserId(Long userId);

}
