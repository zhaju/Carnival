import java.util.*;

public class FlyFishing extends GameBooth{
    public FlyFishing (){ // constructor
        super (5.00, "Fly Fishing", "sushi roll", "plush fish");
    }
    public String start(){ // starts game and returns prize
        Scanner sc = new Scanner (System.in);
        time.print("The price for Fly Fishing is $5.00. You have 5 tries to catch a fish, which you can trade for prizes.");
        time.print("A Cod is worth 1 point, a Salmon is worth 5, a Swordfish is worth 10, and a Shark is worth 100.");
        time.print("If you get 10 or more points, you win a sushi roll. If you get 15 or more, you win a plush fish.\n");

        int points = 0;
        for (int i=0; i<5; i++){
            int rand = (int)(Math.random()*10 + 1); // random number from 1-10
            time.print("Press any key to cast your hook.");
            sc.next();
            time.print("...\n...\n...");
            if (rand>=1 && rand<=3){ // 30% chance
                time.print ("You didn't catch anything...");
            }
            else if (rand>=4 && rand<=6){ // 30%
                time.print ("You caught a cod (1 pt)!");
                points+=1;
            }
            else if (rand>=7 && rand<=8){ // 20%
                time.print ("You caught a salmon (5 pts)!");
                points+=5;
            }
            else if (rand==9){ // 10%
                time.print ("You caught a swordfish (10 pts)!");
                points+=10;
            }
            else if (rand==10){ // 10%
                time.print ("You caught a SHARK (100 pts)!");
                points+=100;
            }
            System.out.println();
        }
        if (points>=15){
            this.winLarge();
            time.print("You got "+points+" points. Congratulations! You won a plush fish!");
            return "plush fish";
        }
        else if (points>=10){
            this.winSmall();
            time.print("You got "+points+" points. Congratulations! You won a sushi roll!");
            return "sushi roll";
        }
        else {
            time.print("You got "+points+" points. Unlucky, you didn't win anything.");
            return null;
        }
    }
}