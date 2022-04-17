package fr.ktung.dumbtesting.arrays.validmountain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidMountainTest {

  private final ValidMountain validMountain = new BasicValidMountain();

  @Test
  public void test1() {
    int[] arr = new int[]{2,1};
    assertFalse(validMountain.validMountainArray(arr));
  }

  @Test
  public void test2() {
    int[] arr = new int[]{3,5,5};
    assertFalse(validMountain.validMountainArray(arr));
  }

  @Test
  public void test3() {
    int[] arr = new int[]{0,3,2,1};
    assertTrue(validMountain.validMountainArray(arr));
  }

  @Test
  public void test4() {
    int[] arr = new int[]{1,3,2};
    assertTrue(validMountain.validMountainArray(arr));
  }

  @Test
  public void test5() {
    int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
    assertFalse(validMountain.validMountainArray(arr));
  }

  @Test
  public void test6() {
    int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
    assertFalse(validMountain.validMountainArray(arr));
  }
}
