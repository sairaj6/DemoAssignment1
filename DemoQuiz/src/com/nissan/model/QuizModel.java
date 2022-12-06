package com.nissan.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.nissan.lib.QuizClass;


public class QuizModel {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static QuizClass quizClass = new QuizClass();
	
	public static void quizQuestions()
	{
		
		char condition ;
		Map<String,String> statesAndCapital = HashMapQuize.getStatesAndCapitals();
		
		List<QuizClass> quizClassList = new ArrayList<>();
		
		int totalMarks = 0;
		int queNo = 0;
		boolean isScored;
		boolean flag = true;
		String name ="";
		
		 System.out.println("Enter Your Name : ");
	      name = scanner.next();
	      while(flag)
	      {
		    	System.out.println("Press 1 to start the quiz");
				System.out.println("Press 2 to see your report");
				System.out.println("Press 3 to exit");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					for(int j = 0; j< 5; j++)
					{
						Random rand = new Random();
					      int upperbound = 29;
					      int int_random = rand.nextInt(upperbound);
						
					      String question = "What is Capital of " + statesAndCapital.keySet().toArray()[int_random];
					      String ans = (String)statesAndCapital.values().toArray()[int_random];
					      
						//System.out.println(int_random+1);
					     
						System.out.println(question);
						System.out.print("Answer : ");
						String capital = scanner.next();
						
						if(capital.equalsIgnoreCase(ans))
						{
							isScored = true;
							totalMarks++;
							quizClassList.add(new QuizClass(question, ans, capital, isScored));
						}
						else {
							isScored = false;
							quizClassList.add(new QuizClass(question, ans, capital, isScored));
						}
					}
					break;
				case 2:
					System.out.println("Displaying " + name + "'s quiz report.........");
					System.out.println("=================================================================================================================================================================================");
					System.out.printf("%80s", name + "'s Quiz Report\n");
					System.out.println("=================================================================================================================================================================================");
					System.out.println(String.format("%20s%50s%20s%20s%20s",
							"Ques No.", "Question", "Correct Answer",
							"Your Answer", "Score"));
					System.out.println("=================================================================================================================================================================================");
					int serialNo = 0;
					for (QuizClass quizClass : quizClassList) {
						byte point = 0;
						if (quizClass.isScored()) {
							point = 1;
						}
						System.out.println(String.format(
								"%20s%50s%20s%20s%20s", ++serialNo,
								quizClass.getQuestion(),
								quizClass.getActualAnswer(),
								quizClass.getYourAnswer(), point));
					}
					System.out.println("=================================================================================================================================================================================");
					System.out.println(name + " has scored " + totalMarks
							+ " out of 5");
					System.out.println("=================================================================================================================================================================================");

					
					break;
				case 3:
					flag = false;
					break;
				default:
					System.out.println("Select Correct OperationS");
					break;
				}
	      }	
	}
	
}
