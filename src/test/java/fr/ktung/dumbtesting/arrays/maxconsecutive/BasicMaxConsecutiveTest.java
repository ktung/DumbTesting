package fr.ktung.dumbtesting.arrays.maxconsecutive;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicMaxConsecutiveTest {

  private static BasicMaxConsecutive basicMaxConsecutive;

  @BeforeAll
  private static void setUp() {
    basicMaxConsecutive = new BasicMaxConsecutive();
  }

  @Test
  public void test1() {
    int[] nums = {1,1,0,1,1,1};
    int result = basicMaxConsecutive.findMaxConsecutiveOnes(nums);
    assertEquals(3, result);
  }

  @Test
  public void test2() {
    int[] nums = {1,0,1,1,0,1};
    int result = basicMaxConsecutive.findMaxConsecutiveOnes(nums);
    assertEquals(2, result);
  }
}
