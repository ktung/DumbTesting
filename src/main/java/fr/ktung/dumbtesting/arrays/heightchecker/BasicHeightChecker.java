package fr.ktung.dumbtesting.arrays.heightchecker;

import java.util.Arrays;

public class BasicHeightChecker implements HeightChecker {
  @Override
  public int heightChecker(int[] heights) {
    int[] sortedHeights = Arrays.copyOf(heights, heights.length);

    for (int i = 0; i < sortedHeights.length-1; i++) {
      for (int j = 0; j < sortedHeights.length - 1 - i; j++) {
        if (sortedHeights[j] > sortedHeights[j + 1]) {
          int swap = sortedHeights[j];
          sortedHeights[j] = sortedHeights[j+1];
          sortedHeights[j+1] = swap;
        }
      }
    }

    int diff = 0;
    for (int i = 0; i < heights.length; i++) {
      if (sortedHeights[i] != heights[i]) {
        diff++;
      }
    }
    return diff;
  }
}
