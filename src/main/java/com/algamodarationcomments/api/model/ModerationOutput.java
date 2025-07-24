package com.algamodarationcomments.api.model;

import lombok.Data;

@Data
public class ModerationOutput {

	private Boolean approved;
	
	private String reason;
}
