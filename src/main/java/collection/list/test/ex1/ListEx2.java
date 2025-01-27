package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true) {
            int userInput = sc.nextInt();

            if(userInput == 0) {
                System.out.println("출력");
//                System.out.println(Arrays.toString(userList.toArray()));
                System.out.println(String.join(", " , userList.stream().map(String::valueOf).toArray(String[]::new)));
                break;
            }
            // 반복문 한 번 더 사용하는 게 간단하긴 하겠다
            userList.add(userInput);
        }

    }

}
