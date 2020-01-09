package fr.epita.quizmanager.model;

import java.util.ArrayList;
import java.util.List;

import fr.epita.quizmanager.model.Quiz.Difficulty;

public class QuizManager {
	
	private static QuizManager manager;
	
	private QuizManager() {
		// TODO Auto-generated constructor stub
	}

	public static QuizManager getInstance() {
		if(manager == null) {
			manager = new QuizManager();
		}
		return manager;
	}
	
	public List<Question> getQuestion(String topic, Difficulty difficulty){
		// TODO: temporary code is added to create the questions here which are hardcoded. In future it will be replaced to retreive the questions from DB.
		Question a1 = new Question("What is the capital of France ?", new String[] {"Paris","Delhi", "Colombo", "Brussels"}, 0, "General Knowledge", Difficulty.NORMAL);
		Question a2 = new Question("What is 1+1 = ?", new String[] {"11","2", "101", "22"}, 1, "Math", Difficulty.EASY);
		Question a3 = new Question("What is the capital of Malta ?", new String[] {"Paris","Delhi", "Valletta", "Brussels"}, 2, "General Knowledge", Difficulty.HARD);
		Question a4 = new Question("How many months do we have in a year ?", new String[] {"12","11", "14", "15"}, 0, "General Knowledge", Difficulty.NORMAL);
		Question a5 = new Question("How many months are having 28 days in a year ?", new String[] {"12","11", "1", "15"}, 0, "General Knowledge", Difficulty.HARD);
		Question a6 = new Question("Which is heavier, 1 kg iron or 1 kg cotton ?", new String[] {"iron","cotton", "same"},2, "General Knowledge", Difficulty.EASY);
		
		List<Question> ll = new ArrayList<Question>();
		switch (difficulty) {
		case EASY:
			ll.add(a2);
			ll.add(a6);
			break;
		case HARD:
			ll.add(a3);
			ll.add(a5);
			break;
		case NORMAL:
			ll.add(a1);
			ll.add(a4);
			break;
		default:
			ll.add(a1);
			ll.add(a2);
			ll.add(a3);
			ll.add(a4);
			ll.add(a5);
			ll.add(a6);
		}
		return ll;
	}
}
