package fr.epita.quizmanager.model;

import java.util.List;

public class Quiz {

	private Difficulty difficulty;
	private String topic;
	List<Question> questions;
	public enum Difficulty {
		EASY, NORMAL, HARD
		}	
	public static class Builder {
		
		private Difficulty difficulty;
		private String topic;
		
		public Builder() {
			
		}
		
		public Builder setDifficulty(Difficulty difficulty) {
			this.difficulty = difficulty;
			return this;
		}
		
		public Builder setTopic(String topic) {
			this.topic = topic;
			return this;
		}
		
		public Quiz build() {
			Quiz quiz = new Quiz();
			if(this.topic==null) {
				this.topic= "ALL";
			}
			quiz.difficulty = this.difficulty;
			quiz.topic = this.topic;
			return quiz;
		}
	}
	
	public List<Question> getQuestions() {
		questions = QuizManager.getInstance().getQuestion(topic, difficulty);
		return questions;
	}
	
	public String getResult(int[] answer) {
		String result = new String();
		int i=0;
		int j =1;
		System.out.print("\nResult : ");
		for(Question question: questions) {
			result = result+"\n Question "+j+" :"+question.validateAnswer(answer[i++]);
			j++;
		}
		return result;
	}
}


