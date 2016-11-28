/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG 
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Character and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
	//classtype holds the int for which character was picked based on line.
	private int classType;
	private int playMode;
    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, sets character class, sets name, and modifies difficulty level
      =============================================*/
    public void newGame() {
	String classChoice ="";
	String classThing = "";	
	String classThing2 = "";	
	String s;
	String name = "";
	classThing += "\nWelcome! Choose your class: \n";
	classThing += "\t1: Warrior\n";
	classThing += "\t2: Mage\n";
	classThing+= "\t3: Rogue\n";
	classThing += "\t4: Cat\n";
	classThing += "\t5: Pineapple\n";
	classThing += "Selection: ";
	System.out.print( classThing );
	try {
	    classType = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	//sets classChoice to print the about of that character.
	if (classType == 1){
		classChoice = "Warrior";
	}
	else if (classType == 2){
		classChoice = "Mage";
	}
	else if (classType == 3){
		classChoice = "Rogue";
	}
	else if (classType == 4){
		classChoice = "Cat";
	}
	else{
		classChoice = "Pineapple";
	}
	
	
	s = "\nIntrepid adventurer, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
		if (classChoice == "Warrior"){
		pat = new Warrior( name );
	}
	else if (classChoice == "Rogue"){
		pat = new Rogue( name );
	}
	else if (classChoice == "Mage"){
		pat = new Mage( name );
	}
	else if (classChoice == "Cat"){
		pat = new Cat( name );
	}
	else{
		pat = new Pineapple( name );
	}
	System.out.print( pat.about());
	s = "Welcome to Ye Olde RPG!\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }


	
	classThing2 += "\nYoung one! You must now pick your journey: \n";
	classThing2 += "\t1: Forest: Land of the undead.\n";
	classThing2 += "\t2: Tower: battle of dragons.\n";
	System.out.print( classThing2 );
	try {
	    playMode = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	System.out.println(playMode);
    }//end newGame()

public void playForest(){
	int i = -1;
 	    System.out.println( "\nLo, yo set out on your journey.\n As you're walking," +
		"you read over the quest scroll you are given. It says: 'Dear hero,\n Thank you for your help! " +
		"Some young scoundrels stole my knapsack as I was taking a wee walk to the farm and I really need it back. " +
		"You see, it has all of my tools and I can't afford to buy a new set. Not only that, but I saw the boys run " +
		"off into the forest! After all the rumors about dangers lurking in there, I can't help but feel afraid for " +
		"them. Please hurry! - Farmer Joe'\n Just as you finish reading the letter, you come to a crossroads." +
		"It splits into two paths, one going to the left and the other to the right. Which do you pick?"		);
	try {
		    System.out.println( "\t1: Left. \n\t2: Right." );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		if (i ==1){
		System.out.println("You turn left and keep walking. Suddenly, you bump int something furry. You look up.");}
		else{
			System.out.println("You run to the castle and bump into something scaly. You look up.");
			}
			
}

public void playTower(){
 	    System.out.println( "\nLo, yo set out on your journey.\n As you're walking," +
		"you read over the quest scroll you are given. It says: 'Dear hero,\n Thank you for your help! " +
		"There's a dragon tournament happening today in the Mighty Tower and, being super rich, I have looked " +
		"far and wide for the right dragonslayer to represent me. The Wizard Council has pointed me to you. I need you " +
		"win the tournament for me by defeating the dragon. I'll reward you in millions and you'll uphold my status.'\n" +
		"As you finish reading the letter, you arrive at the tower and clamber up the stairs. You are welcomed into an empty chamber,"+
		"it seems that no one else has decided to take on this suicide mission except for you. The wall opens and something huge flies out" +
		"towards you.");
			
}
    /*=============================================
      boolean playTurn -- simulates a story mode in forest
      pre:  Character pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/

	public boolean playTurn() {

	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, it's a hideous monster!" );

	    smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );
		System.out.println( pat.health );
		System.out.println( smaug.health );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...
	int encounters = 0;
	//loading...
	YoRPG game = new YoRPG();

	//int encounters = 0;
if (game.playMode == 1){
	game.playForest();
	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	};
}
else{
	game.playTower();
		while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	};
}

	System.out.println( "Thy game doth be over." );
	/*================================================
	  ================================================*/
    }//end main

}//end class YoRPG




/*=============================================
  =============================================*/
