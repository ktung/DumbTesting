package fr.ktung.dumbtesting.arrays.mergesorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BasicMergeSortedTest {
  private MergeSorted mergeSorted = new BasicMergeSorted();

  @Test
  public void mergeSortedTest1() {
    int[] nums1 = new int[]{1,2,3,0,0,0};
    int[] nums2 = new int[]{2,5,6};
    mergeSorted.merge(nums1, 3, nums2, 3);
    assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
  }

  @Test
  public void mergeSortedTest2() {
    int[] nums1 = new int[]{1};
    int[] nums2 = new int[]{};
    mergeSorted.merge(nums1, 1, nums2, 0);
    assertArrayEquals(new int[]{1}, nums1);
  }

  @Test
  public void mergeSortedTest3() {
    int[] nums1 = new int[]{0};
    int[] nums2 = new int[]{1};
    mergeSorted.merge(nums1, 0, nums2, 1);
    assertArrayEquals(new int[]{1}, nums1);
  }
}
