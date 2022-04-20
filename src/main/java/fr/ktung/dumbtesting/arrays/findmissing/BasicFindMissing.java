package fr.ktung.dumbtesting.arrays.findmissing;

import java.util.ArrayList;
import java.util.List;

public class BasicFindMissing implements FindMissing {
  @Override
  public List<Integer> findDisappearedNumbers(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int j = Math.abs(nums[i]) - 1;
      nums[j] = -1 * Math.abs(nums[j]);
    }

    List<Integer> output = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        output.add(i+1);
      }
    }

    return output;
  }
}
