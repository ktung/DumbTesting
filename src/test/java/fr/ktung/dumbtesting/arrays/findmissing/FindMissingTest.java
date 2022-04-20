package fr.ktung.dumbtesting.arrays.findmissing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingTest {

  private final FindMissing findMissing = new BasicFindMissing();

  @Test
  public void test1() {
    int[] nums = new int[]{4,3,2,7,8,2,3,1};
    List<Integer> output = findMissing.findDisappearedNumbers(nums);
    assertEquals(Arrays.asList(5,6), output);
  }

  @Test
  public void test2() {
    int[] nums = new int[]{1,1};
    List<Integer> output = findMissing.findDisappearedNumbers(nums);
    assertEquals(Arrays.asList(2), output);
  }
}
