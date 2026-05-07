package _23_Collction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Set - 구현체: HashSet
        // 저장보다는 연산을 위해(주로 중복, 집합연산)
        // 순서가 보장되지 않고, 중복을 허용하지 않는다
        Set<String> fruits = new HashSet<>();

        // 추가
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("토마토");
        fruits.add("사과"); // 중복 -> 하나만 존재하게 됨
        System.out.println(fruits);

        // 조회
        System.out.println(fruits.contains("사과")); // 해시알고리즘(빠름)

        // 제거
        fruits.remove("토마토");
        fruits.remove("어쩌고저쩌고"); // 없는걸 지워도 에러x
        // Map의 key는 HashSet으로 구현되어 있기때문에
        // Map도 없는 Key로 삭제할 때 에러x

        // set에 객체가 있는경우 -> hashCode()의 결과가 같으면 중복판정

        @AllArgsConstructor
        @ToString
        class User {
            private int id;
            private String name;
        }

        Set<User> userSet = new HashSet<>();
        userSet.add(new User(1, "aaa"));
        userSet.add(new User(1, "aaa"));

        // hashCode를 오버라이딩하기 전에는 주소 비교
        // 오버라이딩하면, 필드값 같을때 중복판정
        System.out.println(userSet);


        // 집합연산 - 합집합, 교집합, 차집합
        // 데이터베이스가 더 잘함

        Set<String> name1 = new HashSet<>(Set.of("김하나", "김둘", "김셋"));
        Set<String> name2 = new HashSet<>(Set.of("김하나", "박둘", "박넷"));

        // 합집합 - addAll()
        Set<String> union = new HashSet<>(name1);
        union.addAll(name2);

        // 교집합 - retainAll()
        Set<String> inter = new HashSet<>(name1);
        inter.retainAll(name2); // 중복값 남기기

        // 차집합 - removeAll()
        Set<String> diff = new HashSet<>(name1);
        diff.removeAll(name2);



    }
}
