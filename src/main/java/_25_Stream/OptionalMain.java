package _25_Stream;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        /*
            null체크용 wrapper 클래스
            값이 존재할 수도 있고, 존재하지 않을 수도 있는 상황

            -> 명시적으로 값이 없을수도 있음을 표현
         */

        // null을 보관한 Optional 객체 생성
        Optional<String> opt1 = Optional.ofNullable(null);

        // 존재여부 확인
        System.out.println(opt1.isPresent()); // 존재하면 true
        System.out.println(opt1.isEmpty()); // 없으면 true

        // orElseGet
        // opt1에 값이 있으면 result에 대입
        // 없으면, 기본값을 대입
        String result = opt1.orElseGet(() -> "기본값!!!");
        // orElseThrow
        // opt1에 값이 있으면 result2에 대입
        // 없으면, 예외를 발생시켜라
        try{
            String result2 = opt1.orElseThrow((() -> new RuntimeException("null임!!")));
        } catch (RuntimeException e) {
            System.out.println("예외: " + e.getMessage());
        }
        // ifPresent
        // 값이 있을때만 실행
        opt1.ifPresent(System.out::println);

    }
}
