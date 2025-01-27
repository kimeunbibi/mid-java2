package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest3 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] word = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : word) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        System.out.println(map);
    }
}
