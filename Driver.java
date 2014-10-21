import java.util.*;
import java.io.*;

public class Driver {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String storage;
    Boolean running = true;
    BaseChar player;

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
          choosing = false;
        } else if (s.toLower().equals("mage") || s.toLower().equals("m")) {
          player = new Mage();
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

/*
      //Needs list of all possible actions to perform
      System.out.println("What would you like to do (LIST): ");

      String playerchoice = sc.nextLine();
      //Tedious if statements for user side

      //Depends on the number of actions we want
      int computerchoice = r.nextInt(9);

      //Tedious if statements for computers action
*/


    }	    
  }
}
