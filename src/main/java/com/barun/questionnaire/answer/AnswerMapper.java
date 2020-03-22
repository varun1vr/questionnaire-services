package com.barun.questionnaire.answer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.barun.questionnaire.entities.Answer;

@Component
public class AnswerMapper {
	public AnswerModel mapEntityToModel(Answer entity) {
		AnswerModel model = new AnswerModel();
		BeanUtils.copyProperties(entity, model);
		model.setId(entity.getId());
		return model;
	}

	public Answer mapModelToEntity(AnswerModel model) {
		Answer entity = new Answer();
		BeanUtils.copyProperties(model, entity);
		return entity;
	}
	public void mapModelToEntity(Answer entity, AnswerModel model) {
		BeanUtils.copyProperties(model, entity);
	}

	public void mapEntityToModel(Answer entity, AnswerModel model) {
		BeanUtils.copyProperties(entity, model);		
	}

	public List<AnswerModel> mapEntityToModel(List<Answer> entities) {
		List<AnswerModel> models = new ArrayList<AnswerModel>();
		for (Answer entity : entities) {
			models.add(mapEntityToModel(entity));
		}
		return models;
	}
	
	public List<Answer> mapModelToEntity(List<AnswerModel> models) {
		List<Answer> entities = new ArrayList<Answer>();
		for (AnswerModel model : models) {
			entities.add(mapModelToEntity(model));
		}
		return entities;
	}

}
