package Seminar5;

//      Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

import java.util.HashMap;
import java.util.Map;

public class HWTaskRomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int sum = 0;
        sum += romanMap.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            sum += romanMap.get(s.charAt(i));
            if (romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i - 1))) {
                sum -= romanMap.get(s.charAt(i - 1)) * 2;
            }
        }
        return sum;
    }
}
