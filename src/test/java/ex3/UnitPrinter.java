package ex3;

import ex3.unit.BioUnit;

public class UnitPrinter {
    //제네릭
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());

    }

    //와일드카드
    public static <T extends BioUnit> void printV2(Shuttle<T> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());

    }
}
