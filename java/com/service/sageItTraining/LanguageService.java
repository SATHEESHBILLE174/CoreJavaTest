package com.service.sageItTraining;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.sageItTraining.LanguageRepository;
import com.pojos.sageItTraining.Language;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository languageRepository;

	public List<Language> getAllLanguages(String id) {
		List<Language> languages = new ArrayList<Language>();
		languageRepository.findAllById(id).forEach(languages::add);
		return languages;
	}

	public Language getLanguage(String id) {
		return languageRepository.findById(id).get();
	}

	public void addLaguage(Language language) {
		languageRepository.save(language);
	}

	public void updateLaguage(Language language) {
		languageRepository.save(language);

	}

	public void deleteLanguage(String id) {
		languageRepository.deleteById(id);
	}
}
