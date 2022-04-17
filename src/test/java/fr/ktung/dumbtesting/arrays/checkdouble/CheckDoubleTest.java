package fr.ktung.dumbtesting.arrays.checkdouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckDoubleTest {

  private final CheckDouble checkDouble = new BasicCheckDouble();

  @Test
  public void test1() {
    int[] arr = new int[]{10, 2, 5, 3};
    assertTrue(checkDouble.checkIfExist(arr));
  }

  @Test
  public void test2() {
    int[] arr = new int[]{7,1,14,11};
    assertTrue(checkDouble.checkIfExist(arr));
  }

  @Test
  public void test3() {
    int[] arr = new int[]{3,1,7,11};
    assertFalse(checkDouble.checkIfExist(arr));
  }

  @Test
  public void test4() {
    int[] arr = new int[]{-2,0,10,-19,4,6,-8};
    assertFalse(checkDouble.checkIfExist(arr));
  }

  @Test
  public void test5() {
    int[] arr = new int[]{0,0};
    assertTrue(checkDouble.checkIfExist(arr));
  }
}
