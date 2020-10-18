package com.quizapplication;

public class Game {
	
	
	Question[] questions=new Question[3];
	Player player=new Player();
	
	public void initGame()
	{
		// created 5 objects
		for(int i=0;i<3;i++)
		{
			questions[i]=new Question();
			
		}
		//applying values to the variables of the object
		questions[0].question="Who is the author of Gulliver's Travels?";
		questions[0].option1="Jonathan Swift";
		questions[0].option2="Ernest Hemingway";
		questions[0].option3="Mark Twain";
		questions[0].option4="F. S. Fitzgerald";
		questions[0].correct_answer=1;
		
		questions[1].question="Which is the first aircraft carrier of the Indian Navy";
		questions[1].option1="INS Viraat";
		questions[1].option2="INS Arihant";
		questions[1].option3="INS Vikrant";
		questions[1].option4="INS Vishal";
		questions[1].correct_answer=3;
		
		questions[2].question="Which is a West flowing river?";
		questions[2].option1="Narmada";
		questions[2].option2="Godavari";
		questions[2].option3="Krishna";
		questions[2].option4="Kaveri";
		questions[2].correct_answer=1;
	}
	
	
	public void play()
	{
		
		player.getDetails();
		for(int i=0;i<3;i++)
		{
			boolean status = questions[i].askQuestion();
			if(status==true)
			{
				System.out.println("AMAZINGGGGGGG!!!!!!");
				player.score++;
			}
			else
			{
				System.out.println("AWWW, TRY AGAIN");
			}
		}
		
		System.out.println(player.name + ", your score is "+player.score);
		
		
		
	}
}
