package fr.ktung.dumbtesting.arrays.sortbyparity;

public class BasicSortByParity implements SortByParity {
  @Override
  public int[] sortArrayByParity(int[] nums) {
    int[] output = new int[nums.length];
    int iOutput = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        output[iOutput++] = nums[i];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        output[iOutput++] = nums[i];
      }
    }

    return output;
  }
}
