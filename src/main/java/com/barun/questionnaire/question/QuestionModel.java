package com.barun.questionnaire.question;

public class QuestionModel {
	private int id;
	private String value;
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
