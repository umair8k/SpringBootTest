package com.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.entity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, String>{
	

}
