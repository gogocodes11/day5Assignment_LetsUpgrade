package com.quizapplication;

public class Game {
	
	
	Question[] questions=new Question[5];
	Player player=new Player();
	
	//array creation for questions
	String[] questionsdata = {"Who is the author of Gulliver's Travels?","Which is the first aircraft carrier of the Indian Navy?", "Which is a West flowing river?" , "Which of the following represent active transducer?" , "Which transducer is known as ‘self-generating transducer’?"  };
	
	//array creations for the options
	String[] options1={"Jonathan Swift" ,"INS Viraat", "Narmada","Strain gauge","Active transducer" };
	String[] options2={"Ernest Hemingway","INS Arihant","Godavari", " Thermistor"," Passive transducer"};
	String[] options3={"Mark Twain","INS Vikrant","Krishna","LVDT","Secondary transducer" };
	String[] options4={"F. S. Fitzgerald","INS Vishal","Kaveri","Thermocouple"," Analog transducer" };
	int[] answers = {1,3,1,4,1 };
	
	public void initGame()
	{
		// created 5 objects
		for(int i=0;i<5;i++)
		{
			questions[i]=new Question();
			
		}
		
		
		for(int i=0;i<5;i++){
			questions[i].question=questionsdata[i];
			questions[i].option1=options1[i];
			questions[i].option2=options2[i];
			questions[i].option3=options3[i];
			questions[i].option4=options4[i];
			questions[i].correct_answer=answers[i];
		}
	}
	
	
	public void play()
	{
		
		player.getDetails();
		for(int i=0;i<5;i++)
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
