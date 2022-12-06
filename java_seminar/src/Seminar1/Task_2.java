package Seminar1;

public class Task_2 {
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        int i = a.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int j = b.length() - 1; j >= 0; j--) {
            if (b.charAt(j) == '1') {
                carry++;
            }
            if (i > 0 && a.charAt(j) == '1') {
                carry++;
            }
            sb.append(carry % 2);
            i--;
            carry = carry / 2;
        }
        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();

    }
}
