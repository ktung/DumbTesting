package fr.ktung.dumbtesting.arrays.sortbyparity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortByParityTest {

  private final SortByParity sortByParity = new BasicSortByParity();

  @Test
  public void test1() {
    int[] nums = new int[]{3,1,2,4};
    int[] output = sortByParity.sortArrayByParity(nums);
    assertArrayEquals(new int[]{2,4,3,1}, output);
  }

  @Test
  public void test2() {
    int[] nums = new int[]{0};
    int[] output = sortByParity.sortArrayByParity(nums);
    assertArrayEquals(new int[]{0}, output);
  }
}
