package fr.epita.quizmanager.model;

import fr.epita.quizmanager.model.Quiz.Difficulty;

public class Question {

	private String statement;
	private String[] options;
	private int answer;
	private String topic;
	private Difficulty difficulty;

	public Question(String statement, String[] options, int answer, String topic, Difficulty difficulty) {
		this.statement = statement;
		this.answer = answer;
		this.options = options;
		this.topic = topic;
		this.difficulty = difficulty;
	}

	public String getTopic() {
		return topic;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}
	
	public String getStatement() {
		return statement;
	}

	public String[] getOptions() {
		return options;
	}

	boolean validateAnswer(int optionNumber) {
		if(optionNumber == answer) {
			return true;
		} else {
			return false;
		}
	}
}
