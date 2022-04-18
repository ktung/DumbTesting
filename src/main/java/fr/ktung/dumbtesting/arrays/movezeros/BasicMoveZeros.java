package fr.ktung.dumbtesting.arrays.movezeros;

public class BasicMoveZeros implements MoveZeros {
  @Override
  public void moveZeroes(int[] nums) {
    int iNotZero = -1;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] == 0) {
        if (iNotZero == -1) {
          iNotZero = i;
        }
        for (; iNotZero < nums.length-1; iNotZero++) {
          if (nums[iNotZero] != 0) {
            break;
          }
        }
        nums[i] = nums[iNotZero];
        nums[iNotZero] = 0;
      }
    }
  }
}
