package Seminar5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskIntersectionofTwoArrays {
    public int[] interselection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return interselection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(nums2[num])) {
                intersection.add(nums2[num]);
                set.remove(nums2[num]);
            }
        }
        int[] outarr = new int[intersection.size()];
        for (int i = 0; i < outarr.length; i++) {
            outarr[i] = intersection.get(i);
        }
        return outarr;
    }
}
