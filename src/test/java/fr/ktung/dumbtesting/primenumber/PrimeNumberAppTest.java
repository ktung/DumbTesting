package fr.ktung.dumbtesting.primenumber;

import java.util.Set;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberAppTest {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void isPrimeNumber() {
    assertFalse(PrimeNumberApp.isPrimeNumber(0));
    assertFalse(PrimeNumberApp.isPrimeNumber(1));
    assertTrue(PrimeNumberApp.isPrimeNumber(2));
    assertTrue(PrimeNumberApp.isPrimeNumber(3));
    assertTrue(PrimeNumberApp.isPrimeNumber(5));
    assertFalse(PrimeNumberApp.isPrimeNumber(4));
    assertTrue(PrimeNumberApp.isPrimeNumber(7));
    assertFalse(PrimeNumberApp.isPrimeNumber(8));
    assertFalse(PrimeNumberApp.isPrimeNumber(9));
    assertFalse(PrimeNumberApp.isPrimeNumber(10));
    assertTrue(PrimeNumberApp.isPrimeNumber(11));
  }

  @Test
  public void generatePrimeNumberEmpty() {
    assertTrue(PrimeNumberApp.generatePrimeNumber(0, 0).isEmpty());
    assertTrue(PrimeNumberApp.generatePrimeNumber(-2, 1).isEmpty());
  }

  @Test
  public void generatePrimeNumberInvalidRange() {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("Max can't be lower than min");
    PrimeNumberApp.generatePrimeNumber(10, 2);
  }

  @Test
  public void generatePrimeNumbersOk() {
    Set<Integer> primeNumbers = PrimeNumberApp.generatePrimeNumber(-1, 2);
    assertFalse(primeNumbers.isEmpty());
    assertEquals(1, primeNumbers.size());
    primeNumbers.forEach(number -> assertTrue(PrimeNumberApp.isPrimeNumber(number)));

    primeNumbers = PrimeNumberApp.generatePrimeNumber(-1, 20);
    assertFalse(primeNumbers.isEmpty());
    assertEquals(8, primeNumbers.size());
    primeNumbers.forEach(number -> assertTrue(PrimeNumberApp.isPrimeNumber(number)));
  }
}
