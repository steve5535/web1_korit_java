package _24_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain2 {
    // 메서드가 단독으로 T타입 사용
    public static List<String> filter(List<String> list, Predicate<String> p) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (p.test(s)) {
                result.add(s);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // "표준" 함수형 인터페이스
        // -> stream API와 함께 쓰인다.
        /*
            표준 함수형 인터페이스
            1. interface Function<T, R>: T타입 매개변수, R타입 리턴
            - R apply(T t);
            2. interface Consumer<T>: T타입 매개변수, 리턴 없음
            - void accept(T t);
            3. interface Supplier<T>: 매개변수 없음, T타입 리턴
            - T get();
            4. Predicate<T>: T타입 매개변수, boolean 리턴
            - boolean test(T t);
         */

        Function<String, String> addNim = name -> name + "님";
        System.out.println(addNim.apply("이순신"));

        Consumer<String> printer = log -> {
            String msg = "로그: " + log;
            System.out.println(msg);
        };

        printer.accept("람다로 만든 로그입니다");
        Predicate<String> isMale = gender -> {
            if(gender.equals("남자")) {
                return true;
            }
            return false;
        };

        System.out.println(isMale.test("여자"));

        // 람다식에서 매개변수가 하나면, () 생략
        // 하나도 없을때는 생략 불가능
        Supplier<RuntimeException> errorGen = () -> new RuntimeException("내가 만든 에러");
        try {
            throw errorGen.get();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Predicate를 활용하여서
        // 100 ~ 1000 사이의 숫자이면서 짝수면 true 아니면 false
        // 람다식을 작성하세요
        Predicate<Integer> validator = num -> {
            if (num >= 100 && num < 1000 && num % 2 == 0) {
                return true;
            }
            return false;
        };
        System.out.println(validator.test(141));

        List<String> names = List.of("김철수", "박철수", "김영희", "을지문덕");
        List<String> kims = filter(names, s -> s.startsWith("김"));
        System.out.println(kims);
        // 우리가 만든 filter로 3글자 초과하는 이름만 List로 추출
        System.out.println(filter(names, s -> s.length() > 3));
        System.out.println(filter(names, s -> s.equals("김철수")));

    }
}
