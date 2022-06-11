package fr.ktung.dumbtesting.queuestacks.numberofislands;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

  @ParameterizedTest
  @ValueSource(classes = { BFSNumberOfIslands.class, DFSNumberOfIslands.class })
  public void test1(Class<NumberOfIslands> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    NumberOfIslands numberOfIslands = clazz.getConstructor().newInstance();

    char[][] grid = {
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};

    int count = numberOfIslands.numIslands(grid);
    assertEquals(1, count);
  }

  @ParameterizedTest
  @ValueSource(classes = { BFSNumberOfIslands.class, DFSNumberOfIslands.class })
  public void test2(Class<NumberOfIslands> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    NumberOfIslands numberOfIslands = clazz.getConstructor().newInstance();

    char[][] grid = {
        {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};

    int count = numberOfIslands.numIslands(grid);
    assertEquals(3, count);
  }

}
