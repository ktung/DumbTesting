package fr.ktung.dumbtesting.primenumber;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberAppTest {

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
    assertThrows(IllegalArgumentException.class, () -> {
      PrimeNumberApp.generatePrimeNumber(10, 2);
    }, "Max can't be lower than min");
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
