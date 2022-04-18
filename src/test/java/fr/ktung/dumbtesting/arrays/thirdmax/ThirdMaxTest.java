package fr.ktung.dumbtesting.arrays.thirdmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaxTest {

  private final ThirdMax thirdMax = new BasicThirdMax();

  @Test
  public void test1() {
    int[] nums = new int[]{3,2,1};
    int output = thirdMax.thirdMax(nums);
    assertEquals(1, output);
  }

  @Test
  public void test2() {
    int[] nums = new int[]{1,2};
    int output = thirdMax.thirdMax(nums);
    assertEquals(2, output);
  }

  @Test
  public void test3() {
    int[] nums = new int[]{2,2,3,1};
    int output = thirdMax.thirdMax(nums);
    assertEquals(1, output);
  }
}
