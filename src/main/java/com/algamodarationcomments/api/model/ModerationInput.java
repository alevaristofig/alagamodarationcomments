package com.algamodarationcomments.api.model;

import lombok.Data;

@Data
public class ModerationInput {

	private String text;
	
	private String commentId;
}
