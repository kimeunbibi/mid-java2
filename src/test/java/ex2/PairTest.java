package ex2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("data");
        System.out.println("pair1 = " + pair1.getSecond());

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("key");
        pair2.setSecond("value");
        System.out.println("pair2 = " + pair2.getFirst());
        System.out.println("pair2 = " + pair2.getSecond());
        System.out.println("pair2 = " + pair2);
    }
}
