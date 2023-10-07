package com.pavan.inotebookwithspring.controllers;

import com.pavan.inotebookwithspring.models.Notes;
import com.pavan.inotebookwithspring.models.User;

public class NotesAndUserDTO {
	 private Notes note;
	    private User user;
		public Notes getNote() {
			return note;
		}
		public void setNote(Notes note) {
			this.note = note;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
	    
	    

}
