package fr.ktung.dumbtesting.arrays.removeelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BasicRemoveElementTest {

  private final RemoveElement removeElement = new BasicRemoveElement();

  @Test
  public void removeElementTest1() {
    int[] nums = new int[]{3,2,2,3};
    int output = removeElement.removeElement(nums, 3);
    assertEquals(2, output);
    assertArrayEquals(new int[]{2,2}, Arrays.copyOfRange(nums, 0, output));
  }

  @Test
  public void removeElementTest2() {
    int[] nums = new int[]{0,1,2,2,3,0,4,2};
    int output = removeElement.removeElement(nums, 2);
    assertEquals(5, output);
    for (int i = 0; i < output; i++) {
      assertNotEquals(2, nums[i]);
    }
  }

  @Test
  public void removeElementTest3() {
    int[] nums = new int[]{};
    int output = removeElement.removeElement(nums, 0);
    assertEquals(0, output);
    assertArrayEquals(new int[]{}, Arrays.copyOfRange(nums, 0, output));
  }

  @Test
  public void removeElementTest4() {
    int[] nums = new int[]{2};
    int output = removeElement.removeElement(nums, 3);
    assertEquals(1, output);
    assertArrayEquals(new int[]{2}, Arrays.copyOfRange(nums, 0, output));
  }

  @Test
  public void removeElementTest5() {
    int[] nums = new int[]{1};
    int output = removeElement.removeElement(nums, 1);
    assertEquals(0, output);
    assertArrayEquals(new int[]{}, Arrays.copyOfRange(nums, 0, output));
  }
}
