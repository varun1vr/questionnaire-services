package com.barun.questionnaire.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/question1")
	public List<QuestionModel> getQuestion() {
		List<QuestionModel> models = questionService.getAll();
		return models;
	}
	
	/**
	 * @param questionModel
	 * @return
	 */
	@PostMapping()
	public QuestionModel create(@RequestBody QuestionModel questionModel) {
		QuestionModel model = questionService.create(questionModel);
		return model;
	}

}
