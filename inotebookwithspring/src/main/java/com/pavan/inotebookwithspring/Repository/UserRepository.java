package com.pavan.inotebookwithspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.inotebookwithspring.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
