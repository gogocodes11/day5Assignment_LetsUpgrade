package com.quizapplication;
import java.util.Scanner;
public class Question {
	String question,option1,option2,option3,option4;
	int correct_answer,user_answer;
	Scanner sc=new Scanner(System.in);
	public boolean askQuestion()
	{
		System.out.println(question);
		System.out.println("1. "+option1);
		System.out.println("2. "+option2);
		System.out.println("3. "+option3);
		System.out.println("4. "+option4);
		System.out.println("Please choose an answer: ");
		user_answer=sc.nextInt();
		if(user_answer==correct_answer)
		{
			return true;
		}
		return false; //return = EOFn()
	}
	
	
}
