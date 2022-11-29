package fr.ktung.dumbtesting.sorting.sortcolors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    @ParameterizedTest
    @ValueSource(classes = {BasicSortColors.class})
    public void test1(Class<SortColors> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SortColors sortColors = clazz.getConstructor().newInstance();

        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }

    @ParameterizedTest
    @ValueSource(classes = {BasicSortColors.class})
    public void test2(Class<SortColors> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SortColors sortColors = clazz.getConstructor().newInstance();

        int[] nums = new int[]{2,0,1};
        sortColors.sortColors(nums);
        assertArrayEquals(new int[]{0,1,2}, nums);
    }
}
