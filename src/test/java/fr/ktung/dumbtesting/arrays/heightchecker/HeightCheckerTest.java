package fr.ktung.dumbtesting.arrays.heightchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightCheckerTest {

  private final HeightChecker heightChecker = new BasicHeightChecker();

  @Test
  public void test1() {
    int[] heights = new int[]{1,1,4,2,1,3};
    int output = heightChecker.heightChecker(heights);
    assertEquals(3, output);
  }

  @Test
  public void test2() {
    int[] heights = new int[]{5,1,2,3,4};
    int output = heightChecker.heightChecker(heights);
    assertEquals(5, output);
  }

  @Test
  public void test3() {
    int[] heights = new int[]{1,2,3,4,5};
    int output = heightChecker.heightChecker(heights);
    assertEquals(0, output);
  }
}
