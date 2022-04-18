package fr.ktung.dumbtesting.arrays.movezeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZerosTest {

  private final MoveZeros moveZeros = new BasicMoveZeros();

  @Test
  public void test1() {
    int[] nums = new int[]{0,1,0,3,12};
    moveZeros.moveZeroes(nums);
    assertArrayEquals(new int[]{1,3,12,0,0}, nums);
  }

  @Test
  public void test2() {
    int[] nums = new int[]{0};
    moveZeros.moveZeroes(nums);
    assertArrayEquals(new int[]{0}, nums);
  }
}
