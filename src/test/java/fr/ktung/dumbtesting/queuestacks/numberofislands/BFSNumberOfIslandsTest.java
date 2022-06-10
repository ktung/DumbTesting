package fr.ktung.dumbtesting.queuestacks.numberofislands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BFSNumberOfIslandsTest {

  private final NumberOfIslands numberOfIslands = new BFSNumberOfIslands();

  @Test
  public void test1() {
    char[][] grid = {
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};

    int count = numberOfIslands.numIslands(grid);
    assertEquals(1, count);
  }

  @Test
  public void test2() {
    char[][] grid = {
        {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};

    int count = numberOfIslands.numIslands(grid);
    assertEquals(3, count);
  }

}
