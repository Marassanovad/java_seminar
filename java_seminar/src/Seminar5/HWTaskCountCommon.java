package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class HWTaskCountCommon {
    //    Первый вариант, прошел только 52-53 теста из 60
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words1) {
            counter.putIfAbsent(word, 0);
            counter.put(word, counter.get(word) + 1);
        }
        for (String word : words2) {
            if (!counter.containsKey(word)) {
                counter.put(word, -1);
            } else {
                counter.put(word, counter.get(word) - 1);
            }
        }
        for (var pair : counter.entrySet()) {
            if (pair.getValue() == 0) {
                count++;
            }
        }
        return count;
    }
}
