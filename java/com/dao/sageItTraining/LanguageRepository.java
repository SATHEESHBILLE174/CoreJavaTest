package com.dao.sageItTraining;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pojos.sageItTraining.Language;

public interface LanguageRepository extends CrudRepository<Language ,String> {

	List<Language> findAllById(String id);

}
