package com.barun.questionnaire.question;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barun.questionnaire.entities.Question;


@Service
public class QuestionService {

	@Autowired
	protected QuestionRepository repository;

	@Autowired
	protected QuestionMapper mapper;

	public List<QuestionModel> getAll() {
		List<QuestionModel> models = new ArrayList<QuestionModel>();
		try {
			List<Question> entities = repository.findAll();
			models = mapper.mapEntityToModel(entities);
		} catch (Exception ex) {
			throw ex;
		}
		return models;
	}

	public QuestionModel create(QuestionModel model) {
		try {
			Question entity = mapper.mapModelToEntity(model);
			entity = repository.save(entity);
			model = mapper.mapEntityToModel(entity);
		} catch (Exception ex) {
			throw ex;
		}

		return model;
	}

}
