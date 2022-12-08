package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "a a a aaaa a a aaaaa fdsa dffvv";
        String[] textArray = text.split("\\s");
        Map<String, Integer> counter = new HashMap<>();
        for (String word : textArray) {
//            if (!counter.containsKey(word)){
//                counter.put(word,1);
//            }
//            else{
//                counter.put(word, counter.get(word)+1);
//            }
            counter.putIfAbsent(word, 0);
            counter.put(word, counter.get(word) + 1);

        }
    }
}
