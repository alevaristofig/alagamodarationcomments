package com.algamodarationcomments.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algamodarationcomments.api.model.ModerationInput;
import com.algamodarationcomments.api.model.ModerationOutput;
import com.algamodarationcomments.domain.service.ModerationService;

@RestController
@RequestMapping(path = "/api/moderate")
public class ModerationController {
	
	@Autowired
	private ModerationService service;

	@PostMapping
	public ModerationOutput moderation(@RequestBody ModerationInput input) {
		return service.moderate(input);
	}
}
