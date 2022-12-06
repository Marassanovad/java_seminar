// package Seminar2;

// public class HW_MaxAreaofIsland_695 {
//     class Solution {
//         public int maxAreaOfIsland(int[][] grid) {
//             int count = 0;
//             for (int i = 0; i < grid.length; i++) {
//                 for (int j = 0; j < grid[i].length; j++) {
//                     if (grid[i][j] == 1) {
//                         count = Math.max(count, dfs(grid, i, j));
//                     }
//                 }
//             }
//             return count;
//         }

//         public int dfs(int[][] grid, int i, int j) {
//             if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] != 1) {
//                 return 0;
//             }
//             grid[i][j] = '#';
//             return 1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1);
//         }
//     }
// }


