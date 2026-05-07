package _24_Lambda;

import java.util.ArrayList;
import java.util.List;

interface Calculator {
    int calc(int a, int b);
}

public class LambdaMain {
    public static void printResult(int a, int b, Calculator c) {
        int result = c.calc(a, b);
        System.out.println("연산결과: " + result);
    }

    public static void main(String[] args) {
        // 람다식의 최종 목적
        printResult(10, 5, (a, b) -> a + b);

        /*
            자바는 메서드 단독 존재 불가능
            메서드를 객체처럼 다루고 싶다
                - 매개변수로 메서드를 전달하고 싶다.
                - 리턴으로 메서드를 리턴하고 싶다.
            -> 메서드 하나만 가지는 객체를 만들자
            -> 익명클래스(한번 쓰고 버리는 클래스)
         */

        // add는 익명클래스 객체 - 캐스팅되어있는 상태
        // Calculator 객체가 아님
        // Calculator를 implements받은 아무개 객체
        Calculator add = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };

        // multi는 Calculator implements받은 아무개2 객체
        Calculator multi = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        };

        // printResult는 매개변수로 Calculator 타입 받음
        printResult(10, 5, add); // 캐스팅되어 있음
        printResult(10, 5, multi); // 캐스팅되어 있음

        // 어차피 메서드 하나만 가지고 있음
        // 어차피 오버라이딩 해야함(인터페이스로 만들 익명클래스)
        // 메서드이름, 매개변수타입 생략
        // 리턴을 한줄에 작성할 수 있으면, {} 및 return 키워드 생략
        Calculator add2 = (a, b) -> a + b;

        // 실습) Calculator로 multi, divide를 람다로 생략해서 구현
        Calculator multi2 = (a, b) -> a * b;
        Calculator divide = (a , b) -> a / b;

        // 메서드 매개변수자리에 메서드를 람다식으로 정의하면서 넘겨줌
        printResult(10, 5, (n1, n2) -> {
            int a = n1 + n2;
            int b = n1 * n2;
            return a + b;
        });

        List<String> names = List.of(
                "홍길동", "김길동", "", "을지문덕",
                "이재용", "페이커", "", "손흥민"
        );

        // 이름이 3글자 이하인 이름들만 저장
        List<String> under3Name = new ArrayList<>();
        StringChecker is3Name = s -> {
            if (s.length() <= 3) {
                return true;
            }
            return false;
        };

        for (String name : names) {
            if (is3Name.check(name)) {
                under3Name.add(name);
            }
        }

        // StringChecker를 이용하여
        // 빈문자열을 제외한 이름들만 trimNames에 추가해 주세요
        List<String> trimNames = new ArrayList<>();
        StringChecker isEmptyStr = s -> s.isEmpty();
        for (String name : names) {
            if (!isEmptyStr.check(name)) {
                trimNames.add(name);
            }
        }

        System.out.println(trimNames);

    }
}
