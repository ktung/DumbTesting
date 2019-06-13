package fr.ktung.dumbtesting.primenumber;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumberApp {

  public static boolean isPrimeNumber(int number) {
    if (number < 2) {
      return false;
    }

    if (0 == number%2) {
      return 2==number;
    }

    for (int i = 3; i*i <= number; i+=2) {
      if (0 == number%i) {
        return false;
      }
    }

    return true;
  }

  public static Set<Integer> generatePrimeNumber(int min, int max) throws IllegalArgumentException {
    if (min > max) {
      throw new IllegalArgumentException("Max can't be lower than min");
    }

    if (max < 2) {
      return Collections.emptySet();
    }


    Set<Integer> primeNumber = new HashSet<>();
    for (int i = min; i <= max; i++) {
      if (isPrimeNumber(i)) {
        primeNumber.add(i);
      }
    }

    return primeNumber;
  }

}
