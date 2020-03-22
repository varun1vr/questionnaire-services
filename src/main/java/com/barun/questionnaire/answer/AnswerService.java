package com.barun.questionnaire.answer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barun.questionnaire.entities.Answer;

@Service
public class AnswerService {

	@Autowired
	protected AnswerRepository repository;

	@Autowired
	protected AnswerMapper mapper;

	public List<AnswerModel> getAll() {
		List<AnswerModel> models = new ArrayList<AnswerModel>();
		try {
			List<Answer> entities = repository.findAll();
			models = mapper.mapEntityToModel(entities);
		} catch (Exception ex) {
			throw ex;
		}
		return models;
	}

	public AnswerModel create(AnswerModel model) {
		try {
			Answer entity = mapper.mapModelToEntity(model);
			entity = repository.save(entity);
			model = mapper.mapEntityToModel(entity);
		} catch (Exception ex) {
			throw ex;
		}

		return model;
	}

}
