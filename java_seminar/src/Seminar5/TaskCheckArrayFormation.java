package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class TaskCheckArrayFormation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for (var piece : pieces) {
            map.put(piece[0], piece);
        }

        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            int[] piece = map.get(arr[i]);
            for (var x : piece) {
                if (x != arr[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
