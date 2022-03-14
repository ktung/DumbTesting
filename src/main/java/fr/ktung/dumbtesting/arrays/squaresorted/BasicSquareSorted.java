package fr.ktung.dumbtesting.arrays.squaresorted;

import java.util.Arrays;

public class BasicSquareSorted implements SquareSorted {
  @Override
  public int[] squareSorted(int[] nums) {
    int[] squaredNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      squaredNums[i] = nums[i] * nums[i];
    }

    Arrays.sort(squaredNums);
    return squaredNums;
  }
}
