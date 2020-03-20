package com.barun.questionnaire.question;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barun.questionnaire.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
