package Seminar_1;

public class HW_Task_4 {
}

class Solution {
    public String reverseWords(String s) {
        int strLen = s.length();
        int a = strLen - 1;
        StringBuilder sb = new StringBuilder();

        while (a >= 0 && s.charAt(a) == ' ') {
            a--;
        }
        int i = 0;
        while (i < a && s.charAt(i) == ' ') {
            i++;
        }
        while (a >= i) {
            while (a >= i && s.charAt(a) == ' ') {
                a--;
            }
            int end = a;
            while (a >= 0 && s.charAt(a) != ' ') {
                a--;
            }

            sb.append(s.substring(a + 1, end + 1));
            if (a > i) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


