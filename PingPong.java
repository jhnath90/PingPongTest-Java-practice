import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
   Console console = System.console();

   System.out.println("Pick a number.");
   String yourNumber = console.readLine();
   Integer theirNumber = Integer.parseInt(yourNumber);

     for ( Integer number = theirNumber ; number > 0 ; number-- ) {
     
     if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("PingPong");
    } else if (number % 3 == 0) {
      System.out.println("Ping");
    } else if (number % 5 == 0) {
      System.out.println("Pong");
    } else {
      System.out.println(number);
    }
   }
  }
 }