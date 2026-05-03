package _19_NestedClass;

import _15_Abstract.Character;

public class Main {
    public static void main(String[] args) {
        // 중첩클래스
        /*
            1. 메서드안에서 class 선언 - 지역클래스
            -> 메서드안에서만 클래스 역할 가능
            2. 익명클래스
            3. 내부클래스 - 일반내부(x), static내부(o)
         */

        // 익명클래스 - 추상체(추상클래스, 인터페이스)
        // -> 추상체로는 new가 불가능

        // Character를 상속받는 익명 클래스정의와 동시에 생성까지
        // ch는 그럼 Character 객체가 아니다
        // ch는 그냥 익명객체 - Character를 상속받았다
        // 항상 업캐스팅되어있음
        Character ch = new Character("익명", 99, 99) {
            private String a;
            private String b;

            @Override
            public void attack(Character target) {
                System.out.println("익명사용자 공격");
            }
        };

        System.out.println("익명 클래스의 진짜 이름은?");
        System.out.println(ch.getClass().getName()); // 익명

        // 추상체는 익명객체 생성가능
        Yes y = new Yes() {
            @Override
            public void yes() {
                System.out.println("넵!");
            }
        };
        y.yes();

        Reservation r = Reservation.builder() // 깡통빌더객체 리턴
                .username("홍길동") // username 초기화된 빌더객체
                .date("2026-04-30") // dare 초기화된 빌더객체
                .personCount(4)
                .price(89000)
                .build(); // Reservation 생성자를 내부에서 호출

        User u = User.builder()
                .username("성선혁")
                .password("qwer1234")
                .build();

        LombokUser lu = LombokUser.builder()
                .username("롬복")
                .password("lombok")
                .build();

        System.out.println(lu.getUsername());
        lu.setPassword("롬복이다!");

    }
}
