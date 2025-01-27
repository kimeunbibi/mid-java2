package collection.set.javaset.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 코드 작성

        Set<Integer> score = new HashSet<>();
        for (Integer input : inputArr) {
            score.add(input);
        }

        for (Integer s : score) {
            System.out.println(s);
        }

    }
}
