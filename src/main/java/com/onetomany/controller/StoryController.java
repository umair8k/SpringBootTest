package com.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.entity.Story;
import com.onetomany.repository.StoryRepository;

@RestController
@RequestMapping(value="/story")
public class StoryController {
	@Autowired
	StoryRepository storyRepository;

	@ResponseBody
	@RequestMapping(value = "/stories")
	public List<Story> getBookDetails() {
		List<Story> storyresponse = (List<Story>) storyRepository.findAll();
		return storyresponse;
	}

}
