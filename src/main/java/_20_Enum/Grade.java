package _20_Enum;

import lombok.Getter;

@Getter
// enum은 java.lang에 있는 Enum클래스를 상속받은 클래스
public enum Grade {
    // 최상단에 상수객체들을 (생략된)생성자 형식으로 나열
    // public static final Grade SILVER = new Grade(5);
    SILVER(5),
    GOLD(10),
    DIAMOND(20)
    ;

    private int discountRate;

    // enum은 생성자의 접근제한자는 모두 private
    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

}
