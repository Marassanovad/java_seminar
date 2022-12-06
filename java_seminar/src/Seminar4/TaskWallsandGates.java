package Seminar4;


import java.util.LinkedList;
import java.util.Queue;

class TaskWallsandGates {
    static final int EMPTY = Integer.MAX_VALUE;
    static final int GATE = 0;
    //    static final int WALL = -1;
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void WallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        for (int row = 0; row < rooms[0].length; row++) {
            for (int col = 0; col < rooms.length; col++) {
                if (rooms[row][col] == GATE) {
                    q.add(new int[]{row, col});
                }
            }
        }
        while (!q.isEmpty()) {
            int[] curPoint = q.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] direction : DIRECTIONS) {
                int newRow = curRow + direction[0];
                int newCol = curCol + direction[1];
                if (newRow < 0 || newCol < 0 || newRow >= rooms.length ||
                        rooms[newRow][newCol] != EMPTY) {
                    continue;
                }
                rooms[newRow][newCol] = rooms[curRow][curCol] + 1;
                q.add(new int[]{newRow, newCol});
            }
        }
    }
}