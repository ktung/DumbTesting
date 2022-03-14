package fr.ktung.dumbtesting.arrays.duplicatezeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateZerosTest {
  private final DuplicateZeros duplicateZeros = new BasicDuplicateZeros();

  @Test
  public void duplicateZerosTest1() {
    int[] arr = new int[]{1,0,2,3,0,4,5,0};
    duplicateZeros.duplicateZeros(arr);
    assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, arr);
  }

  @Test
  public void duplicateZerosTest2() {
    int[] arr = new int[]{1,2,3};
    duplicateZeros.duplicateZeros(arr);
    assertArrayEquals(new int[]{1,2,3}, arr);
  }
}
