package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + count);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }

    public void minus(Product product, int count) {
        int exist = cartMap.get(product);
        if (count >= exist) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, exist - count);
        }
    }
}
