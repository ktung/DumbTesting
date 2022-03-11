package fr.ktung.dumbtesting.arrays.maxconsecutive;

public class BasicMaxConsecutive implements MaxConsecutive {
  @Override
  public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int currentMax = 0;

    if (nums.length == 1) {
      return nums[0] == 1 ? 1 : 0;
    }

    for (int i = 0; i < nums.length - 1; i++) {
      int sum = nums[i] + nums[i+1];
      if (sum == 2) {
        if (currentMax == 0) {
          currentMax = 2;
        } else {
          currentMax++;
        }
      } else if (1 == sum) {
        currentMax = 1;
      } else {
        currentMax = 0;
      }

      if (currentMax > max) {
        max = currentMax;
      }
    }

    return max;
  }
}
