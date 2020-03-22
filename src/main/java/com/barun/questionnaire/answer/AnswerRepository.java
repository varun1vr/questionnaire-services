package com.barun.questionnaire.answer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barun.questionnaire.entities.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long>{

}
