package _17_Object;

import java.util.Objects;

public class ObjectStudent {
    private String name;
    private int age;

    public ObjectStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString
    // 클래스풀네임 + @ + 16진수
    // 국룰: 객체의 상태(필드 값) 정보를 문자열로 표현
    // 로깅목적, 디버깅목적

    @Override
    public String toString() {
        String data = "name=" + this.name + "age=" + this.age;
        return data;
    }

    // equals()
    // == 연산자와 동일하게 주소비교
    // -> 오버라이딩하여서 필드가 같으면 true가 나오게
    @Override
    public boolean equals(Object o) {
        // 같은 클래스 객체가 아니면 false
        // 혹은 null이면 false
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        // 다운캐스팅
        ObjectStudent that = (ObjectStudent) o;
        // 필드 값 비교
        // 원시자료형 필드는 == 연산자 사용
        // 참조자료형 필드는 Objects.equals() 사용
        return age == that.age && Objects.equals(name, that.name);

    }

    // equals를 오버라이딩하면, 반드시 hashCode도 오버라이딩 해줘야함
    // HashMap, HashSet같은 해시기반 자료형에서 중복체크할때 사용됨
    @Override
    public int hashCode() {
        // hash에 넘기는 필드는 equals와 동일하게
        return Objects.hash(name, age);
    }


}
