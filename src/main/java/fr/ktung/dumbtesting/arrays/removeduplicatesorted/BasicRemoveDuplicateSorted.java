package fr.ktung.dumbtesting.arrays.removeduplicatesorted;

public class BasicRemoveDuplicateSorted implements RemoveDuplicateSorted {
  @Override
  public int removeDuplicates(int[] nums) {
    int iUnique = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[iUnique] != nums[i]) {
        iUnique++;
        nums[iUnique] = nums[i];
      }
    }

    return iUnique+1;
  }
}
