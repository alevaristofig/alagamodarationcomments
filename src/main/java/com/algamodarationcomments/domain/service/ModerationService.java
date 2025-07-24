package com.algamodarationcomments.domain.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.algamodarationcomments.api.model.ModerationInput;
import com.algamodarationcomments.api.model.ModerationOutput;

@Service
public class ModerationService {

	private static final List<String> BANNED_WORDS = List.of("ódio", "xingamentos", "idiotas");
	
	public ModerationOutput moderate(ModerationInput input) {
		String text = input.getText().toLowerCase();
		
		Set<String> bannedWordsFound = new HashSet<>();
		
		for(String word: BANNED_WORDS) {
			if(text.contains(word.toLowerCase())) {
				bannedWordsFound.add(word);
			}
		}
		
		if(!bannedWordsFound.isEmpty()) {
			return ModerationOutput.builder()
					.approved(false)
					.reason("Contém palavras proibidas" + bannedWordsFound)
					.build();
		}
		
		return ModerationOutput.builder()
				.approved(true)
				.reason("Comentário aprovado")
				.build();
	}
}
