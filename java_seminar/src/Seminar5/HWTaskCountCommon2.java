package Seminar5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HWTaskCountCommon2 {

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words1)
            count.merge(word, 1, Integer::sum);

        for (final String word : words2)
            if (count.containsKey(word) && count.get(word) < 2)
                count.merge(word, -1, Integer::sum);

        return (int) count.values().stream().filter(i -> i == 0).count();
    }
}
