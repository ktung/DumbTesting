package fr.ktung.dumbtesting.arrays.squaresorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BasicSquareSortedTest {
  private SquareSorted squareSorted = new BasicSquareSorted();

  @Test
  public void squareSortedTest() {
    assertArrayEquals(new int[]{0,1,9,16,100}, squareSorted.squareSorted(new int[]{-4,-1,0,3,10}));
    assertArrayEquals(new int[]{4,9,9,49,121}, squareSorted.squareSorted(new int[]{-7,-3,2,3,11}));
  }
}
