import java.util.*;
import java.io.*;

public class Driver {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String line;
    Boolean running = true;
    String choice = ""; // needs an initial value otherwise Java worries it might not be set
    while (running) {

      Boolean choosing = true;

      while (choosing) {
        // creates player type
        System.out.println("Choose your class:");
        System.out.println("\tr: Rogue");
        System.out.println("\tw: Warrior");
        System.out.print("Your class: ");
        line=sc.nextLine();
        if (line.toLowerCase().equals("warrior") || line.toLowerCase().equals("w")) {
          choice = "w";
          choosing = false;
        } else if (line.toLowerCase().equals("rogue") || line.toLowerCase().equals("r")) {
          choice = "r";
          choosing = false;
        } else {
          System.out.println("Invalid name\n");
        }
      }

      // create player
      BaseChar player;
      if (choice.equals("w"))
        player = new Warrior();
      else // if (choice.equals("r")) // needs to be else otherwise Java worries it might not be set
        player = new Rogue();
      
      //choosing name
      System.out.print("\nChoose your name: ");
      line = sc.nextLine();
      player.setName(line);
      System.out.println("Welcome " + player);
      
      Boolean battle = true;

      while (battle) {
	  //needs to generate random opponent named 'opponent', handle turns
	  //Needs list of all possible actions to perform
	  System.out.println("What would you like to do (LIST): ");
	  if (choice.equals("w")) {
	      System.out.println("1: Revitalize");
	      System.out.println("2: Get Pumped");
	      System.out.println("3: Paralyzer");
	      System.out.println("4: Ambush");
	      System.out.println("5: Double Strike");
	      System.out.println("6: Finisher");
	      System.out.println("7: Special Warrior Attack");
	  }
	  else {
	      System.out.println("1: Replenish");
	      System.out.println("2: Meditate");
	      System.out.println("3: Curse");
	      System.out.println("4: Surprise");
	      System.out.println("5: Double Strike");
	      System.out.println("6: Demolisher");
	      System.out.println("7: Special Rogue Attack");
	  }
	  String playerchoice = sc.nextLine();
	  if (playerchoice.equals("1")) {
	      player.rest();
	  } else if (playerchoice.equals("2")) {
	      if (player.getMana()>=30) {
		  player.boost();
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else if (playerchoice.equals("3")) {
	      if (player.getMana()>=50) {
		  player.stun(opponent);
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else if (playerchoice.equals("4")) {
	      if (player.getMana()>=40) {
		  player.sneak(opponent);
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else if (playerchoice.equals("5")) {
	      if (player.getMana()>=20) {
		  player.doubleStrike(opponent);
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else if (playerchoice.equals("6")) {
	      if (player.getMana()>=60) {
		  player.superAttack(opponent);
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else if (playerchoice.equals("7")) {
	      if (player.getMana()>=80) {
		  player.special(opponent);
	      } else {
		  System.out.println("Not enough mana, try again");
	      }
	  } else {
	      System.out.println("invalid attack, try again");
	  }
      }      
		    
	      
  
     
      //Tedious if statements for user side
      
      //Depends on the number of actions we want
      int computerchoice = r.nextInt(9);

      //Tedious if statements for computers action


    }	    
  }
}
