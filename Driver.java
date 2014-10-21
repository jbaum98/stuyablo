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
        } else if (line.toLowerCase().equals("rogue") || line.toLowerCase().equals("m")) {
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
/*
      //Needs list of all possible actions to perform
      System.out.println("What would you like to do (LIST): ");
	  System.out.println("1: getPumped");
	  System.out.println("2: Discombobulate");
	  System.out.println("3: sneakAttack");
	  System.out.println("4: doubleStrike");
	  System.out.println("5: Finisher");
	  String playerchoice = sc.nextLine();
	  //if (playerchoice.equals("1") {
	  //	  if (player.getMana
      }
      else {
	  System.out.println("1: Meditate");
	  System.out.println("2: Curse");
	  System.out.println("3: Surprise");
	  System.out.println("4: doubleSpell");
	  System.out.println("5: Demolisher");
      }

     
      //Tedious if statements for user side
      
      //Depends on the number of actions we want
      int computerchoice = r.nextInt(9);

      //Tedious if statements for computers action
*/

    }	    
  }
}
