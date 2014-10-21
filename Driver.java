import java.util.*;
import java.io.*;

public class Driver {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String storage;
    Boolean running = true;
    BaseChar player;
    String ident=""
    while (!done) {

      Boolean choosing = true;

      while (choosing) {
        //creates player type
        System.out.println("Choose your class:");
        System.out.println("\tm) Mage");
        System.out.println("\tw) Warrior");
        System.out.print("Your class:");
        storage=sc.nextLine();
        if (s.toLower().equals("warrior") || s.toLower().equals("w")) {
          player = new Warrior();
	  ident="w";
          choosing = false;
        } else if (s.toLower().equals("mage") || s.toLower().equals("m")) {
          player = new Mage();
	  ident="m";
          choosing = false;
        } else {
          System.out.println("Invalid name");
        }
      }

      //choosing name
      System.out.print("Choose your name:");
      s = sc.nextLine();
      player.setName(s);
      System.out.println("Welcome "+s);

      //Needs list of all possible actions to perform
      System.out.println("What would you like to do (LIST): ");
      if (ident.equals("w")) {
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
