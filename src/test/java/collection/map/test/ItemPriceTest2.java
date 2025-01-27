package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        Map<String, Integer> result = new HashMap<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1000) {
                result.put(key, 1000);
            }
        }

        System.out.println(result.keySet());
    }
}
