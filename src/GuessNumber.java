import java.util.*;

public class GuessNumber extends GameBooth{
    public GuessNumber(){ // constructor
        super (4.00, "Guess the Number", "t-shirt", "plush bear");
    }
    public String start(){ // starts game and returns prize
        Scanner sc = new Scanner (System.in);
        time.print("The cost for Guess the Number is $4.00.");
        time.print("I'm thnking of a number from 1-50. You can try and guess what my number is, and I will tell you if my number is higher or lower.");
        time.print("If you can guess my number within 6 tries, you win a Plush Bear. If you can guess it within 8 tries, you win a t-shirt.");
        time.print("Let's begin!");
        int num = (int) (Math.random()*50) + 1; // random number from 1-50
        int tries = 0;
        while (true){
            System.out.print("Enter your guess: ");
            int guess;
            while (!sc.hasNextInt()){ // catches non-int inputs
                time.print("That is not a valid option. Please enter a number from 1-50.");
                sc.next();
            }
            guess = sc.nextInt();
            if (guess<1 || guess>50){ // catches numbers out of range
                time.print("Please guess a number from 1-50.");
                time.print("Enter your guess: ");
                guess = sc.nextInt();
            }
            tries++;
            if (guess == num){
                time.print("Congratulations! You guessed the number!");
                break;
            }
            else if (guess < num){
                time.print ("higher");
            }
            else if (guess > num){
                time.print ("lower");
            }
        }
        time.print("You guessed the number in "+tries+" tries.");
        if (tries<=6){
            this.winLarge();
            time.print("Congratulations! You won a plush bear!");
            return "plush bear";
        }
        if (tries>=6 && tries<=8){
            this.winSmall();
            time.print("Congratulations! You won a t-shirt!");
            return "t-shirt";
        }
        else {
            time.print("Unlucky, you didn't win anything.");
            return null;
        }
    }
}
