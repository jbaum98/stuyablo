import java.util.*;
import java.io.*;

public class Driver {
    //player vs. warrior
    public void encounterWarrior(BaseChar player){
	WarriorPC monster = new WarriorPC();
	while (monster.getHealth()>0 || player.getHealth()>0) {
	    //encounter
	}
    }
    //player vs. mage
    public void encounterMage(BaseChar player){
	MagePC monster = new MagePC();
	while (monster.getHealth()>0 || player.getHealth()>0) {
	    //encounter
	}
    }
    public static void main (String[] args){
       	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	String s="";

	while (!s.equals("done")) {

	    /* Is this needed?
	    System.out.print("Input: ");
	    s = sc.nextLine();
	    System.out.println("Your input: "+s);
	    */
	    

	    //creates player type
	    System.out.print("Warrior or Mage?");
	    s=sc.nextLine();

	    //but as of now doesn't seem to actually create new object
	    Boolean failure = True;

	    while (failure) {
		if (s.equals("Warrior")) {
		    Warrior player = new Warrior();
		    failure = False;
		} else if (s.equals("Mage")) {
		    Mage player = new Mage();
		    failure = False;
		} else {
		    System.out.print("Invalid name; choose from 'Warrior' or 'Mage'");
		}
	    }

	    //choosing name
	    System.out.println("Choose your name!");
	    s = sc.nextLine();

	    player.setName(s);
	    System.out.println("Your name: "+s);
	

	    //Needs list of all possible actions to perform
	    System.out.println("What would you like to do (LIST): ");
	    
	    String playerchoice = sc.nextLine();
	    //Tedious if statements for user side

	    //Depends on the number of actions we want
	    int computerchoice = r.nextInt(9);

	    //Tedious if statements for computers action


	    
	}	    
    }
}
