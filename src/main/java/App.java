import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("enter a year");
    int userYear = Integer.parseInt(myConsole.readLine());
    LeapYear leapYear = new LeapYear();
    boolean leapYearResult = leapYear.isLeapYear(userYear);
    System.out.println("Is that year a leap year? " + leapYearResult);
  }
}