package fr.ktung.dumbtesting.arrays.removeelement;

import fr.ktung.dumbtesting.arrays.removeduplicatesorted.BasicRemoveDuplicateSorted;
import fr.ktung.dumbtesting.arrays.removeduplicatesorted.RemoveDuplicateSorted;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateSortedTest {

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveDuplicateSorted.class })
  public void removeDuplicatesTest(Class<RemoveDuplicateSorted> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveDuplicateSorted removeDuplicateSorted = clazz.getConstructor().newInstance();

    int[] nums = new int[]{1, 1, 2};
    int output = removeDuplicateSorted.removeDuplicates(nums);
    assertEquals(2, output);
    assertArrayEquals(new int[]{1, 2}, Arrays.copyOfRange(nums, 0, output));
  }
}
