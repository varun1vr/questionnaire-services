package com.barun.questionnaire.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.barun.questionnaire.entities.Question;

@Component
public class QuestionMapper {
	public QuestionModel mapEntityToModel(Question entity) {
		QuestionModel model = new QuestionModel();
		BeanUtils.copyProperties(entity, model);
		model.setId(entity.getId());
		return model;
	}

	public Question mapModelToEntity(QuestionModel model) {
		Question entity = new Question();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
	public void mapModelToEntity(Question entity, QuestionModel model) {
		BeanUtils.copyProperties(model, entity);
	}

	public void mapEntityToModel(Question entity, QuestionModel model) {
		BeanUtils.copyProperties(entity, model);		
	}

	public List<QuestionModel> mapEntityToModel(List<Question> entities) {
		List<QuestionModel> models = new ArrayList<QuestionModel>();
		for (Question entity : entities) {
			models.add(mapEntityToModel(entity));
		}
		return models;
	}
	
	public List<Question> mapModelToEntity(List<QuestionModel> models) {
		List<Question> entities = new ArrayList<Question>();
		for (QuestionModel model : models) {
			entities.add(mapModelToEntity(model));
		}
		return entities;
	}

}
