package com.barun.questionnaire.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("answer")
public class AnswerController {
	
	@Autowired
	private AnswerService answerService;
	
//	@GetMapping("/question1")
//	public List<QuestionModel> getQuestion() {
//		List<QuestionModel> models = questionService.getAll();
//		return models;
//	}
	
	/**
	 * @param answerModel
	 * @return
	 */
	@PostMapping()
	public AnswerModel create(@RequestBody AnswerModel answerModel) {
		AnswerModel model = answerService.create(answerModel);
		return model;
	}

}
