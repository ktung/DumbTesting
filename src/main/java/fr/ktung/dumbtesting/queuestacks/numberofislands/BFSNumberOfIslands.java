package fr.ktung.dumbtesting.queuestacks.numberofislands;

import java.util.LinkedList;
import java.util.Queue;

public class BFSNumberOfIslands implements NumberOfIslands {
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
          bfs(grid, i, j);
          nbIslands++;
        }
      }
    }

    return nbIslands;
  }

  // Mark all adjacent land as water using breadth-first search
  private void bfs(char[][] grid, int x, int y) {
    Queue<Integer> queue = new LinkedList<>();
    int maxDimension = (grid.length >= grid[0].length) ? grid.length : grid[0].length;
    int positionId = x*maxDimension + y;
    queue.offer(positionId);

    while (!queue.isEmpty()) {
      int currentId = queue.poll();
      int currentX = currentId/maxDimension;
      int currentY = currentId%maxDimension;

      // Search land north
      if (currentX > 0 && grid[currentX-1][currentY] == '1') {
        queue.offer((currentX-1) * maxDimension + currentY);
        grid[currentX-1][currentY] = '0';
      }
      // Search land east
      if (currentY < grid[0].length-1 && grid[currentX][currentY+1] == '1') {
        queue.offer(currentX * maxDimension + (currentY+1));
        grid[currentX][currentY+1] = '0';
      }
      // Search land south
      if (currentX < grid.length-1 && grid[currentX+1][currentY] == '1') {
        queue.offer((currentX+1) * maxDimension + currentY);
        grid[currentX+1][currentY] = '0';
      }
      // Search land west
      if (currentY > 0 && grid[currentX][currentY-1] == '1') {
        queue.offer(currentX * maxDimension + (currentY-1));
        grid[currentX][currentY-1] = '0';
      }
    }
  }
}
