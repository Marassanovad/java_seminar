package Seminar1;

public class HW_Task_3 {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                k += 1;
                copyInd += 1;
            }
        }
        while (copyInd < nums.length) {
            nums[copyInd++] = '_';
        }
        return k;

    }
}
