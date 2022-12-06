package Seminar3;

//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.ArrayList;
import java.util.List;

public class HWTask1 {
    static List<List<Integer>> ans;

    public static void main(String[] args) {
        String str = "? + ? = ??";
        char[] chars = createChar(str);
        List<Integer> signIndex = findIndex(chars);
        List<List<Integer>> variables = new HWTask1().combine(signIndex.size(), chars, signIndex);
        if (variables.toArray().length == 0) {
            System.out.println("Нету решений");
        } else {
            System.out.println("Решения: " + ans);
        }
    }

    private static char[] createChar(String args) {
        args = args.replace(" ", "");
        char[] chars = args.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+') {
                chars[i] = '=';
            }
        }
        return chars;
    }

    private static List<Integer> findIndex(char[] chars) {
        List<Integer> Index = new ArrayList<Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') Index.add(i);
        }
        return Index;
    }

    private static List<List<Integer>> combine(int size, char[] chars, List<Integer> signIndex) {
        ans = new ArrayList<>();
        createNum(new ArrayList<>(), size, chars, signIndex);
        return ans;
    }

    private static void createNum(List<Integer> comb, int size, char[] chars, List<Integer> signIndex) {
        if (comb.size() == size) {
            checkNum(comb, chars, signIndex);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            createNum(comb, size, chars, signIndex);
            comb.remove(comb.size() - 1);
        }
    }

    private static void checkNum(List<Integer> comb, char[] chars, List<Integer> signIndex) {
        for (int i = 0; i < signIndex.size(); i++) {
            chars[signIndex.get(i)] = Character.forDigit(comb.get(i), 10);
        }
        String[] str = String.valueOf(chars).split("=");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        if (a + b == c) {
            ans.add(new ArrayList<>(comb));
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }
}

