package com.pavan.inotebookwithspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.inotebookwithspring.models.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {

}
