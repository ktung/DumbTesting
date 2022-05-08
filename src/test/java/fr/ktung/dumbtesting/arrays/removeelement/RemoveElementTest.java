package fr.ktung.dumbtesting.arrays.removeelement;

import fr.ktung.dumbtesting.ParallelizableTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ParallelizableTest
public class RemoveElementTest {

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveElement.class, RareRemoveElement.class })
  public void removeElementTest1(Class<RemoveElement> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveElement removeElement = clazz.getConstructor().newInstance();

    int[] nums = new int[]{3,2,2,3};
    int output = removeElement.removeElement(nums, 3);
    assertEquals(2, output);
    assertArrayEquals(new int[]{2,2}, Arrays.copyOfRange(nums, 0, output));
  }

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveElement.class, RareRemoveElement.class })
  public void removeElementTest2(Class<RemoveElement> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveElement removeElement = clazz.getConstructor().newInstance();

    int[] nums = new int[]{0,1,2,2,3,0,4,2};
    int output = removeElement.removeElement(nums, 2);
    assertEquals(5, output);
    for (int i = 0; i < output; i++) {
      assertNotEquals(2, nums[i]);
    }
  }

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveElement.class, RareRemoveElement.class })
  public void removeElementTest3(Class<RemoveElement> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveElement removeElement = clazz.getConstructor().newInstance();

    int[] nums = new int[]{};
    int output = removeElement.removeElement(nums, 0);
    assertEquals(0, output);
    assertArrayEquals(new int[]{}, Arrays.copyOfRange(nums, 0, output));
  }

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveElement.class, RareRemoveElement.class })
  public void removeElementTest4(Class<RemoveElement> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveElement removeElement = clazz.getConstructor().newInstance();

    int[] nums = new int[]{2};
    int output = removeElement.removeElement(nums, 3);
    assertEquals(1, output);
    assertArrayEquals(new int[]{2}, Arrays.copyOfRange(nums, 0, output));
  }

  @ParameterizedTest
  @ValueSource(classes = { BasicRemoveElement.class, RareRemoveElement.class })
  public void removeElementTest5(Class<RemoveElement> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    RemoveElement removeElement = clazz.getConstructor().newInstance();

    int[] nums = new int[]{1};
    int output = removeElement.removeElement(nums, 1);
    assertEquals(0, output);
    assertArrayEquals(new int[]{}, Arrays.copyOfRange(nums, 0, output));
  }
}
