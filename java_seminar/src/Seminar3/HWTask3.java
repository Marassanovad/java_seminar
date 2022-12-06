package Seminar3;


//Дан массив целых чисел (List<Integer>) найти минимальное, максимальное значения в этом массиве.

import java.util.*;

public class HWTask3 {
    public static void main(String[] args) {
        Integer[] num = { 6, 8, 3, 5, 1, 9 };
        List<Integer> ls = Arrays.asList(num);

        System.out.println("Min element:" + Collections.min(ls));
        System.out.println("Max element:" + Collections.max(ls));
    }


}

