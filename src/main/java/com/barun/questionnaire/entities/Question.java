package com.barun.questionnaire.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblQuestion")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private int id;

	@Column(name = "VALUE", nullable = true)
	private String value;
	
	@Column(name = "QUESTIONTYPE", nullable = true)
	private String questionType;
	
	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	@Column(name = "REF_ANSWER_ID", nullable = true)
	private int refAnswerId;
	
	public int getId() {
		return id;
	}

	public int getRefAnswerId() {
		return refAnswerId;
	}

	public void setRefAnswerId(int refAnswerId) {
		this.refAnswerId = refAnswerId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
