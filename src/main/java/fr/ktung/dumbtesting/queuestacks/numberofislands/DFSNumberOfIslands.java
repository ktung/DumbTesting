package fr.ktung.dumbtesting.queuestacks.numberofislands;

import java.util.LinkedList;
import java.util.Queue;

public class DFSNumberOfIslands implements NumberOfIslands {
  @Override
  public int numIslands(char[][] grid) {
    int m = grid.length;
    if (m == 0) {
      return 0;
    }
    int n = grid[0].length;
    if (n == 0) {
      return 0;
    }

    int nbIslands = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          nbIslands++;
        }
      }
    }

    return nbIslands;
  }

  // Mark all adjacent land as water using depth-first search
  private void dfs(char[][] grid, int x, int y) {
    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') {
      return;
    }

    grid[x][y] = '0';
    dfs(grid, x-1, y);
    dfs(grid, x, y+1);
    dfs(grid, x+1, y);
    dfs(grid, x, y-1);
  }
}
