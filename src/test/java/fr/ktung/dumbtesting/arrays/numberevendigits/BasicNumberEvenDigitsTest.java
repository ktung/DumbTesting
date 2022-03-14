package fr.ktung.dumbtesting.arrays.numberevendigits;

import fr.ktung.dumbtesting.arrays.numberevendigits.BasicNumbersEvenDigits;
import fr.ktung.dumbtesting.arrays.numberevendigits.NumbersEvenDigits;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicNumberEvenDigitsTest {

  private static NumbersEvenDigits numbersEvenDigits;

  @BeforeAll
  private static void setUp() {
    numbersEvenDigits = new BasicNumbersEvenDigits();
  }

  @Test
  public void numbersEvenDigits_ShouldReturn2() {
    assertEquals(2, numbersEvenDigits.numberEvenDigits(new int[]{12,345,2,6,7896}));
  }

  @Test
  public void numbersEvenDigits_ShouldReturn1() {
    assertEquals(1, numbersEvenDigits.numberEvenDigits(new int[]{555,901,482,1771}));
  }
}
