package HomeJava3;

// 1) На вход приходят два ArrayList<Integer> напишите метод,который проверяет два массива на равенство.Нужно реализовать алгоритм,
// не использовать метод equals.

// 2) На вход методу приходят два ArrayList<Integer> и целое число num. Проверьте, что число num встречается в обоих массивах одинаковое 
//  кол-во раз.

// 3) На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа. Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
// 4) На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Zad {
    public static void main(String[] args) {
        Integer[] arr = {12, 21, 3};
        List<Integer> l = Arrays.asList(arr); 
        ArrayList<Integer> mode = new ArrayList<>(l);

        Integer[] arr2 = {12, 21, 3, 7}; 
        List<Integer> qwe = Arrays.asList(arr2); 
        ArrayList<Integer> mode2 = new ArrayList<>(qwe);

        System.out.println(equality2(mode, mode2, 3));

        // Integer[] arr = { 10, 4, 5, 6, 7, 2, 2, 9, 8, 3, 12, 9 };
        // List<Integer> l = Arrays.asList(arr);
        // ArrayList<Integer> mode = new ArrayList<>(l);
        // System.out.println(delEven(mode));
    }

    static boolean equality(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean equality2(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {
        int counterNum = 0;
        int counter = 0;
        while (counter < list1.size() || counter < list2.size()) {
            if (counter < list1.size()) {
                if (list1.get(counter) == num) {
                    counterNum += 1;
                }
            }

            if (counter < list2.size()) {
                if (list2.get(counter) == num) {
                    counterNum -= 1;
                }
            }
            counter += 1;
        }

        return counterNum == 0;
    }

    static ArrayList<Integer> sortEven(ArrayList<Integer> list) {

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                num.add(list.get(i));
                ind.add(i);
            }
        }

        Collections.sort(num);

        for (int i = 0; i < ind.size(); i++) {
            list.set(ind.get(i), num.get(i));
        }
        return list;
    }

    static ArrayList<Integer> delEven(ArrayList<Integer> list) {
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            int num = col.next();
            if (num % 2 == 0) {
               col.remove();
            }
        }
        return list;
    }
}