import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forNumberNotDivisibleByFour_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1999));
  }

  @Test
  public void isLeapYear_forMultiplesOf100_false() {
    LeapYear leapYear = new LeapYear();
    assertEquals(false, leapYear.isLeapYear(1900));
  }
}