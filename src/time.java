//taken from some guy on stack overflow
// creates a typewriter effect for user experience

public class time {
  // defines thread.sleep
    public static void sleep (int ms){
      try
      {
          Thread.sleep(ms);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
    } 
    // prints text with a 20 ms delay between each letter
    public static void print(String s) {
      for (int i=0; i<s.length(); i++) {
          time.sleep(20);
          System.out.print(s.charAt(i));
      }
      System.out.print("\n");
    }
  }
  