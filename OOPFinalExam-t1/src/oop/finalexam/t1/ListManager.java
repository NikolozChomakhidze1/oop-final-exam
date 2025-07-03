package oop.finalexam.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ListManager generates a third list from two predefined lists using a specific algorithm.
 * It handles errors gracefully if indexes go out of bounds.
 */
public class ListManager {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 10, 5, 7, 6, 4, 3, 2, 9, 8);
        List<String> list2 = Arrays.asList("dko", "htk", "hlx", "jvv", "msd", "qeq", "fsz", "ggo", "xjz", "uoo", "kua", "xbl");
        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            int val = list1.get(i);
            int targetIndex = val + 1;

            if (targetIndex >= 0 && targetIndex < list2.size()) {
                String result = list2.get(targetIndex) + val;
                list3.add(result);
            } else {
                System.out.println("Error: list2 does not contain index " + targetIndex);
            }
        }

        System.out.println("List3: " + list3);
    }
}
