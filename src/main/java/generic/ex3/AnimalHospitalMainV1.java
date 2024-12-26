package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1: 개 병원에 고양이 전달
        dogHospital.setAnimal(cat); // 매개변수 체크 실패: 컴파일 오류가 발생하지 앟음

        // 문제2: 개 타입 반환, 캐스팅 필요
        dogHospital.setAnimal(dog);

        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
    }
}