package com.nissan.app;

import java.util.Random;
import java.util.Scanner;

import com.nissan.model.QuizModel;

/*
ask user to enter name
display each question in shuffled manner:
	example capital of maharashtra : xxxx
Display result with Score
		FullMarks - extra brilliant
				  - Good Effort
				  - Try Again
*/
public class QuizApp {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int totalMarks = 0;
		int queNo = 0;
		QuizModel.quizQuestions();
		
	}

}
