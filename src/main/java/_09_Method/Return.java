package _09_Method;

import java.util.Scanner;

public class Return {
    // 리턴할 데이터가 존재하면, void 대신
    // 해당 데이터의 자료형을 적어준다
    public static int addNum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    // 1. 정수를 매개변수로 전달받아, 짝수면 true, 홀수면 false 리턴
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2. 이름을 매개변수로 전달받아, 이름끝에 "님" 붙혀주세요
    public static String addNim(String name) {
        return name + "님";
    }

    public static Scanner makeScanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        // 매개변수: main -> 메서드 데이터 전송
        // 리턴: 메서드 -> main 데이터를 전송

        // 리턴이 있으면, 호출결과가 리턴데이터가 된다.
        int result1 = addNum(10, 20);
        System.out.println(addNum(1, 2) + 1);

        // f(g()) -> g()부터 호출 -> f()호출
        addNum(addNum(10, 20), 10);

        if (isEven(10)) {
            System.out.println("짝수입니다");
        }

        String result2 = addNim("홍길동");
        if (addNim("김길동").startsWith("김")) {
            System.out.println("김씨입니다");
        }

        // 리턴데이터가 값이면 값처럼, 객체면 객체처럼 다룰 수 있다.

    }
}
