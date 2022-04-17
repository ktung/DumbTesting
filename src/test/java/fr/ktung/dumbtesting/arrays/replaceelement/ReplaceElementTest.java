package fr.ktung.dumbtesting.arrays.replaceelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReplaceElementTest {
  private final ReplaceElement replaceElement = new BasicReplaceElement();

  @Test
  public void test1() {
    int[] arr = new int[]{17,18,5,4,6,1};
    assertArrayEquals(new int[]{18,6,6,6,1,-1}, replaceElement.replaceElements(arr));
  }

  @Test
  public void test2() {
    int[] arr = new int[]{400};
    assertArrayEquals(new int[]{-1}, replaceElement.replaceElements(arr));
  }
}
