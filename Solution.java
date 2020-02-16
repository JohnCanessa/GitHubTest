/**
 * Author: John Canessa - john.canessa@gmail.com
 * 
 * Testing a set of git commands to compare with the gh CLI.
 */
public class Solution {

  /**
   * This function loops displaying a message the number of times specified.
   */
  /**
   * Test scaffolding.
   * 
   * @throws InterruptedException
   */
  static void displayMessage(long delay, int times, String msg) throws InterruptedException {

    // **** loop displaying message ****
    for (int i = 0; i < times; i++) {

      // **** display message ****
      System.out.println("displayMessage <<< i: " + i + " msg ==>" + msg + "<==");

      // **** delay ****
      Thread.sleep(delay);
    }
  }

  public static void main(String[] args) throws InterruptedException {

    // **** display welcome message ****
    System.out.println("main <<< welcome !!!");

    // **** display messages a number of times ****
    long delay = 1000;
    int times = 7;
    String msg = "working hard ...";
    displayMessage(delay, times, msg);

    // **** display good bye message ****
    System.out.println("main <<< bye bye");
  }
}