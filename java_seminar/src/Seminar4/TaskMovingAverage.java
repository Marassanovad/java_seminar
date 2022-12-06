package Seminar4;

import java.util.LinkedList;
import java.util.Queue;

class TaskMovingAverage {
    Queue<Integer> q = new LinkedList<Integer>();
    int windowSize;
    int sum;

    public void MovingAverage(int size) {
        windowSize = size;
        sum = 0;
    }

    public double next(int val) {
        sum += val;
        q.add(val);
        if (q.size() > windowSize) {
            sum -= q.poll();
        }
        return sum / q.size();
    }
}
