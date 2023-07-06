import java.util.*;

public class Player{ // stores money, prizes, and calls game function
    private double spendingMoney;  
    private ArrayList <String> prizesWon;

    public Player(int money){ // constructor
      spendingMoney = money;
      prizesWon = new ArrayList<String>();
    }
    //returns true if player can play game, false if not
    public void play(GameBooth game){
      if (spendingMoney>=game.getCost()){
        spendingMoney -= game.getCost();
        String prize = game.start();
        if (prize!=null){
          prizesWon.add(prize);
        }
      }
      else {
        time.print("Sorry, you don't have enough money to play that game. Try again later!");
      }
    }
    public double getSpendingMoney(){ // returns spending money
      return spendingMoney;
    }
    public ArrayList<String> getPrizesWon(){ // returns list of prizes won
      return prizesWon;
    }
    @Override // overrides generic toString() method
    public String toString(){
      return "You have $"+spendingMoney+" remaining. You have won "+prizesWon.size()+" prize(s).";
    }
  }