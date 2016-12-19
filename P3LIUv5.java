// The "P3LIUv5" class.
// Joy Liu May 29, 2014
import java.awt.*;
import hsa.Console;

public class P3LIUv5
{
    static Console c;           // The output console
    
    static char tic[][]=new char[4][4];
    

    public static void main (String[] args)
    {  
	c = new Console (100, 100);


	int keepPlay;
	do
	{

	    char key2;
	    introduction (); //Method for the introduction to the program


	    int answer1[] = {   //Correct answers for the 30 questions
		2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1,
		2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2,
		};



	    for (int a = 0 ; a < 30 ; a++)  //the loop will go 30 times until the board is full or someone wins
	    {   
		
		String questions[] [] =   //30 questions for the players
		    {{"Question: \nTan315=1 "},
			{"Question: \nSin210=0.5 "},
			{"Question: \nIf x=b^y, we call this an inverse exponential function   "},
			{"Question: \nLogarithm is not a function   "},
			{"Question: \nCalculator has been programmed to the base of 5 "},
			{"Question: \nThe quadratic formula is c^2=b^2+a^2  "},
			{"Question: \nAnything to the power of 0, always equals to 1"},
			{"Question: \nWhen proving Trig. Identities, you need to pick the hardest side to work with.   "},
			{"Question: \nsin2x=2cosxsinx  "},
			{"Question: \nSine and cosine are primary Trig. Ratios  "},
			{"Question: \nToronto is the capital of Ontario.  "},
			{"Question: \nSt. John is the capital of Newfoundland  "},
			{"Question: \nHalifax is the capital of Nova Scotia    "},
			{"Question: \nThere are only 2 types of errors in Java "},
			{"Question: \nThere are 1D, 2D, and 3D arrays in Java "},
			{"Question: \nJava is a language   "},
			{"Question: \nA while loop is the same as a do-while loop  "},
			{"Question: \nDo-while loop runs at least 2 times  "},
			{"Question: \nCanada is the second largest country in the world  "},
			{"Question: \nChristianity is the largest religion (by population) in the world "},
			{"Question: \nMuslim is a believer of Islam   "},
			{"Question: \nJustin Bieber's favorite color is purple  "},
			{"Question: \nFacebook, twitter, and edmodo all have blue backgrounds  "},
			{"Question: \nMuslims are required to follow the Five Pillars  "},
			{"Question: \nDalai Lama supports gay marriage "},
			{"Question: \nPope Francis does not support gay marriage   "},
			{"Question: \nThe bible supports gay marriage   "},
			{"Question: \nIn Canada, gay marriage is legal "},
			{"Question: \nThesis statement is generally placed in the first paragraph of the conclusion paragraph  "},
			{"Question: \nBoxing day is on December 27   "},
		    };
		

		tic [0] [0] = ' ';
		tic [0] [1] = '1';
		tic [0] [2] = '2';
		tic [0] [3] = '3';
		tic [1] [0] = '1';
		tic [2] [0] = '2';
		tic [3] [0] = '3';
		
		   c.setCursor (1, 1);
		    for (int g = 0 ; g < tic.length ; g++)
		    {
			for (int h = 0 ; h < tic.length ; h++)
			{


			    c.print (tic [g] [h], 5);


			}
			c.println ();
			c.println ();
			lines ();




		    }



		int b = (int) (Math.random () * 30);  //outputing a random number
		c.setCursor(14,1);
		c.println (questions [b] [0]);
		
		


		c.println ("Answer:");
		int answer2 = c.readInt ();

		if (answer2 == answer1 [b])  //if the answer the customer inputed matches the correct answer
		{
		    c.println ("Your answer is correct!");
		    c.clear ();

		    c.setCursor (1, 1);  //Nested loop to display the board
		    for (int g = 0 ; g < tic.length ; g++)
		    {
			for (int  h = 0 ; h < tic.length ; h++)
			{


			    c.print (tic [g] [h], 5);


			}
			c.println ();
			c.println ();
			lines ();




		    }

		    
		    c.println ("Please input the marker (X/O) you want to use in capital, then <Enter>");  //prompt for the user to enter the row and column number and marker
		    char marker = c.getChar ();
		    c.println ("Please input the row number (between 1 and 3) you want to put your marker on, then <Enter>");
		    int rowNumber = c.readInt ();
		    c.println ("Please input the column number (between 1 and 3) you want to put your marker on, then <Enter>");
		    int colNumber = c.readInt ();
		    tic [rowNumber] [colNumber] = marker;

		    c.setCursor (1, 1);

		    for (int p = 0 ; p < tic.length ; p++)  //nested loop to display the headers
		    {
			for (int j = 0 ; j < tic.length ; j++)
			{

			    c.print (tic [p] [j], 5);

			}

			c.println ();
			c.println ();

			lines (); //method that draws horizontal lines and vertical lines for the board
			
		    }
		       c.setCursor (17, 1);
			c.println ();
			c.println ();
			c.println ("Press any key to continue, then <Enter>");
			key2 = c.readChar ();
			
			}
			
			

			
		else   //if the answer the customer inputed does not match the correct answer
		{   c.setCursor (1, 1);
		    for (int g = 0 ; g < tic.length ; g++)
		    {
			for (int h = 0 ; h < tic.length ; h++)
			{


			    c.print (tic [g] [h], 5);


			}
			c.println ();
			c.println ();
			lines ();




		    }
		    c.setCursor(18,1);
		    c.println ("Your answer is wrong! Next player please!");
		    c.println ("Press any key to continue");
		    key2 = c.readChar ();
		    c.clear ();
		    
		    

		}
		
		winner();
		introduction();
		
		}


		//if statements to check if its horizontally/vertically/diagonally a straight line

		


	    
	    c.println ();
	    c.println ("If you want to stop playing, press the 'EXIT' button");
	    c.println ("If you want to play the game again, press '1', then <Enter>");
	    keepPlay = c.readInt ();
	    }

	
	while (keepPlay != 1); //a do while loop to go back to the beginning


	// Place your program here.  'c' is the output console
    } // main method



    public static void introduction () //Method for the introduction to the program
    {
	char key;
	title ();
	c.println (" Welcome to Joy's True and False Trivia Game!");  //Introduction to the program
	c.println ("You will be asked by a random question");
	c.println ("If the answer is true, press'1', then <Enter>");
	c.println ("If the answer is false, press'2', then <Enter>");
	c.println ("Only if the answer is correct, the player can make a move on the board");
	c.println ();


	c.print ("Press any key to continue");
	key = c.readChar ();
	c.clear ();
    }


    public static void lines () //Method for the lines of the board
    {


	c.drawLine (62, 5, 62, 140);
	c.drawLine (108, 5, 108, 140);
	c.drawLine (152, 5, 152, 140);
	c.drawLine (0, 140, 152, 140);
	c.drawLine (0, 110, 152, 110);
	c.drawLine (0, 70, 152, 70);
	c.drawLine (0, 35, 152, 35);

    }


    public static void title () //Method for the title and font
    {
	c.setColor (Color.blue);
	c.setFont (new Font ("Chiller", Font.PLAIN, 40));
	c.drawString ("Joy's TIC-TAC-TOE Game!", 20, 50);
	c.setCursor (5, 1);
	c.println ();
	c.setColor (Color.black);
    }
    
    public static void winner() //Method to check the winner
    {if (tic [1] [1] == 'X' && tic [1] [2] == 'X' && tic [1] [3] == 'X')
		{
		    c.println ("WINNER: Player 1!");
		    c.println ("Hit any key to continue...");
		    int key = c.getChar ();
		    c.clear ();

		}

		else if (tic[2] [1] == 'X' && tic [2] [2] == 'X' && tic [2] [3] == 'X')
		{
		    c.println ("WINNER: Player 1!");
		    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
		}

		else if (tic [3] [1] == 'X' && tic [3] [2] == 'X' && tic[3] [3] == 'X')
	{
	    c.println ("Winner! Player 1!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [1] == 'O' && tic [1] [2] == 'O' && tic [1] [3] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [2] [1] == 'O' && tic [2] [2] == 'O' && tic [2] [3] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [3] [1] == 'O' && tic [3] [2] == 'O' && tic [3] [3] == 'O')
	{
	    c.println ("Winner! Player 2");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	// Vertical
	else if (tic [1] [1] == 'X' && tic [2] [1] == 'X' && tic [3] [1] == 'X')
	{
	    c.println ("Winner! Player 1!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [2] == 'X' && tic [2] [2] == 'X' && tic [3] [2] == 'X')
	{
	    c.println ("Winner! Player 1!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [3] == 'X' && tic [2] [3] == 'X' && tic [3] [3] == 'X')
	{
	    c.println ("Winner! Player 1");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [1] == 'O' && tic[2] [1] == 'O' && tic[3] [1] == 'O')
	{
	    c.println ("Winner! Player 2");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic[1] [2] == 'O' && tic [2] [2] == 'O' && tic [3] [2] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [3] == 'O' && tic[2] [3] == 'O' && tic[3] [3] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	// Diagonal
	else if (tic [1] [1] == 'X' && tic[2] [2] == 'X' && tic [3] [3] == 'X')
	{
	    c.println ("Winner! Player 1!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [3] == 'X' && tic [2] [2] == 'X' && tic [3] [1] == 'X')
	{
	    c.println ("Winner! Player 1!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic[1] [1] == 'O' && tic [2] [2] == 'O' && tic [3] [3] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	else if (tic [1] [3] == 'O' && tic[2] [2] == 'O' && tic[3] [1] == 'O')
	{
	    c.println ("Winner! Player 2!");
	    c.println ();
	    c.println ("Hit any key to continue...");
	    int key = c.getChar ();
	    c.clear ();
	}
	}















} // P3LIUv5 class


