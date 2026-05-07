package _24_Lambda;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Person {
    private final String name;
    private final int age;
}

@FunctionalInterface
interface PersonChecker {
    boolean check(Person p);
}

interface Predicate<T> {
    boolean check(T t);
}

@FunctionalInterface
interface Function<T, R> {
    R apply(T t);
}

public class Practice {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("홍길동", 18),
                new Person("김길동", 22),
                new Person("이파이썬", 30),
                new Person("박스프링부트", 13)
        );

        // 성인만 추출
        List<Person> adults = new ArrayList<>();
        PersonChecker isAdult = p -> {
            int age = p.getAge();
            if (age < 20) {
                return false;
            }
            return true;
        };

        for (Person p : people) {
            if (isAdult.check(p)) {
                adults.add(p);
            }
        }

        // 실습) 이름이 3글자 초과인 사람들만 over3Names에 추가
        List<Person> over3Names = new ArrayList<>();
        PersonChecker isOver3Name = p -> p.getName().length() > 3;
        Predicate<Person> isOver3Name2 = p -> p.getName().length() >3;
        for (Person p : people) {
            if (isOver3Name.check(p)) {
                over3Names.add(p);
            }
        }

        // people에서 성인이 아닌 미성년자들 이름을
        // "비공개"로 바꿔주세요
        // Function을 활용
        List<Person> maskedPeople = new ArrayList<>();
        // Function의 apply를 오버라이딩한거임
        Function<Person, Person> hideMinor = p -> new Person("비공개", p.getAge());

        for (Person p : people) {
            if(p.getAge() < 20) {
                p = hideMinor.apply(p);
            }
            maskedPeople.add(p);
        }

    }
}
