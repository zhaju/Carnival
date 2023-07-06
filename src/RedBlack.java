import java.util.*;

public class RedBlack extends GameBooth{
    
    public RedBlack(){ // constructor
      super (1.50, "Red or Black", "keychain", "plush moose"); 
    }

    public String start(){ // starts game and returns prize
      time.print("The cost for Red or Black is $1.50. You will draw three tokens.");
      time.print("If you draw 3 red or 3 black tokens you win a Plush Moose. Otherwise you win a keychain.");
      String [] choices = {"red", "black"}; // choices are either red or black
      String rand1 = choices[(int)(Math.random()*2)];  // 50% chance to get red or black, repeated 3 times
      String rand2 = choices[(int)(Math.random()*2)];
      String rand3 = choices[(int)(Math.random()*2)];
  
      time.print("You drew a "+rand1+" token.");
      time.print("You drew a "+rand2+" token.");
      time.print("You drew a "+rand3+" token.");
      
      if (rand1.equals(rand2) && rand2.equals(rand3)){ // if identical, user wins large prize
        this.winLarge();
        time.print("You drew three identical tokens. You won a plush moose!");
        return "plush moose";
      }
      else { // othersie, user wins small prize
        this.winSmall();
        time.print("You drew three different tokens. You won a keychain!");
        return "keychain";
      }
    }
  }