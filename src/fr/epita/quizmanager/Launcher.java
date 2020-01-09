package fr.epita.quizmanager;

import java.util.List;
import java.util.Scanner;

import fr.epita.quizmanager.model.Question;
import fr.epita.quizmanager.model.Quiz;
import fr.epita.quizmanager.model.Quiz.Difficulty;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.println("Welcome Guest");
		System.out.print("Enter the difficulty level for Quiz (EASY, NORMAL, HARD): ");
		String dif = b.next();
		Quiz quiz;
		try {
			quiz = new Quiz.Builder().setDifficulty(Difficulty.valueOf(dif)).build();
		} catch (Exception e) {
			System.out.println("Incorrect input, kindly enter one of the keyword displayed above.");
			return;
		}
		List<Question> ll = quiz.getQuestions();
		int answers[] = new int[ll.size()];
		int i=0;
		for(Question question:ll) {
			System.out.println("Question : "+question.getStatement());
			String arr[] = question.getOptions();
			int j=0;
			for(String str: arr) {
				System.out.println(j+": "+str);
				++j;
			}
			System.out.print("Enter Answer : ");
			answers[i++] = b.nextInt();
		}
		System.out.println(quiz.getResult(answers));
	}

}
