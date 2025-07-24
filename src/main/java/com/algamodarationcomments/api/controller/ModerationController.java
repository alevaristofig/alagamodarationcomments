package com.algamodarationcomments.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algamodarationcomments.api.model.ModerationInput;
import com.algamodarationcomments.api.model.ModerationOutput;

@RestController
@RequestMapping(path = "/api/moderate")
public class ModerationController {

	@PostMapping
	public /*ModerationOutput*/void moderation(@RequestBody ModerationInput input) {
		
	}
}
