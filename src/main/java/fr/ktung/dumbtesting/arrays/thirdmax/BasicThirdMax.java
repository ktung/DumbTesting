package fr.ktung.dumbtesting.arrays.thirdmax;

import java.util.Arrays;

public class BasicThirdMax implements ThirdMax {
  @Override
  public int thirdMax(int[] nums) {
    int[] distinctSortedNums = Arrays.stream(nums).sorted().distinct().toArray();
    if (distinctSortedNums.length < 3) {
      return distinctSortedNums[distinctSortedNums.length-1];
    }

    return distinctSortedNums[distinctSortedNums.length-3];
  }
}
