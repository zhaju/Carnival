import java.util.*;

public class PennyToss extends GameBooth{
    // creates two blank boards
    String [][] board = new String [4][4];
    String [][] board2 = new String [4][4];
    
    public PennyToss(){ // constructor
      super (3.00, "Penny Toss", "poster", "plush tiger");  
      board[0][0]="P"; board[0][1]="P"; board[0][2]="P"; board[0][3]="P";
      board[1][0]="P"; board[1][1]="T"; board[1][2]="T"; board[1][3]="P";
      board[2][0]="P"; board[2][1]="T"; board[2][2]="T"; board[2][3]="P";
      board[3][0]="P"; board[3][1]="P"; board[3][2]="P"; board[3][3]="P";
      board2 = board; //copies board1 to board2 so board1 can be edited
    }  

    public String start(){ // starts game and returns prize
      time.print("The cost for Penny Toss is $3.00. You have three throws.");
      printBoard();
      time.print("Land on two poster (P) squares to win a poster, or two plush tigers (T) to win a Plush Tiger!\n");
      int posterCount=0, tigerCount=0;
      // loops 3 times for three throws
      for (int i=0; i<3; i++){
        int randx = (int)(Math.random()*4);
        int randy = (int)(Math.random()*4);
        if (board[randx][randy].equals("P")){
          time.print("You landed on a poster.");
          posterCount++;
        }
        else{ 
          time.print("You landed on a plush tiger.");
          tigerCount++;
        }
        //update board
        if (!board2[randx][randy].equals("X")){
          board2[randx][randy]="X";
        }
        printBoard();
      }
      time.print("You landed on "+posterCount+" posters and "+tigerCount+" tigers.");
      if (tigerCount>=2){
        this.winLarge();
        time.print("Congratulations! You won a plush tiger!");
        return "plush tiger";
      }
      else if (posterCount>=2){
        this.winSmall();
        time.print("Congratulations! You won a poster!");
        return "poster";
      }
      else {
        time.print("Unlucky, you didn't win anything.");
        return null;
      }
    }
    // helper method, prints the board after each throw
    public void printBoard(){
      for (int i=0; i<4; i++){
        for (int j=0; j<4; j++){
          System.out.print("[" + board2[i][j] + "]" + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }