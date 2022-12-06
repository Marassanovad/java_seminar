package Seminar1;

public class HW_Task_5 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char l;
        char r;
        while (left <= right) {
            l = s.charAt(left);
            r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}