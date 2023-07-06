import java.util.*;

public class GameBooth { // superclass, stores data about the cost and prizes of games
    private double cost;  
    private String name;
    private String smallPrize;
    private String largePrize;
    private int largeAwarded;
    private int smallAwarded;
    // constructor
    public GameBooth(double cost, String name, String smallPrize, String largePrize){
      this.cost = cost;
      this.name = name;
      this.smallPrize = smallPrize;
      this.largePrize = largePrize;
      this.largeAwarded = 0;
      this.smallAwarded = 0;
    }
    String start(){ // returns prizes won
      return "";
    }
    public double getCost(){ // returns cost 
      return cost;
    }
    public String getSmallPrize() { // returns small prize NAME
      return smallPrize;
    }
    public String getLargePrize() { // returns large prize NAME
      return largePrize;
    }
    public void winSmall() { // increments smallAwarded
      smallAwarded++;
    }
    public void winLarge() { // increments largeAwarded
      largeAwarded++;
    }
    void prizesAwarded(){ // prints number of prizes awarded from this game
      time.print("You have won "+smallAwarded+" Small Prizes and "+largeAwarded+" Large Prizes from "+name);
    }
  }