import java.util.*;

class Main {
  public static void main(String[] args) {  
    Scanner sc = new Scanner (System.in);
    // create new Player
    Player myPlayer = new Player(100);
    // create array of games
    GameBooth [] games = new GameBooth[5];
    games[1] = new RedBlack();
    games[2] = new PennyToss();
    games[3] = new FlyFishing();
    games[4] = new GuessNumber();
    // start game
    time.print("Welcome to the Carnival! You will be given $100 to start with.");

    while (true) { // loops until the input is 3, when it breaks
      System.out.println();
      time.print("What would you like to do?");
      time.print(" (1) Play a Game \n (2) See Prizes \n (3) Quit");
      time.print("Enter your choice: ");
      //reading input
      int cmd;
      while (!sc.hasNextInt()){ // catches invalid inputs
        time.print("That is not a valid option. Please enter a number from 1-3.");
        sc.next();
      }
      cmd = sc.nextInt();

      if (cmd == 1){ // play a game 
        time.print("Which game would you like to play?");
        time.print(" (1) Red or Black \n (2) Penny Toss \n (3) Fly Fishing \n (4) Guess the Number \n (5) Stop Playing");
        time.print("Enter your choice: ");
        int choice;
        while (!sc.hasNextInt()){ // catches invalid inputs
          time.print("That is not a valid option. Please enter a number from 1-5.");
          sc.next();
        }
        choice = sc.nextInt();

        if (choice>=1 && choice <=5){ // checking that the number is valid 
          if (choice == 5){
            time.print("Exiting Game Menu...");
          }
          else {
            myPlayer.play(games[choice]);
          }
          time.print("You have $"+myPlayer.getSpendingMoney()+" remaining.");
        }
        else { // catches invalid inputs
          time.print("That is not a valid option. Please enter a number from 1-5.");
          sc.next();
        }        
      }
      else if (cmd == 2){ // view prizes
        for (int i=1; i<=4; i++){
          games[i].prizesAwarded();
        }
        time.print("Here are your prizes: "+ myPlayer.getPrizesWon());
      }
      else if (cmd == 3){ // ends game
        time.print("Thank you for playing!");
        break;
      }
      else { // catches invalid inputs
        time.print("That is not a valid option. Please enter a number from 1-3.");
        sc.next();
      }
    }
  }
}