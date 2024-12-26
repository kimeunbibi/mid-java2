package ex3;

import ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + " HP: " + unit.getHp());
    }



    //    public static <T> T in(T t){
//        return t;
//    }
//
//    public static <T> T showInfo(){
//    }

}
