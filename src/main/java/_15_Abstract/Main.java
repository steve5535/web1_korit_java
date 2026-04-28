package _15_Abstract;

public class Main {
    public static void main(String[] args) {
        // Character ch = new Character();
        // 추상클래스는 직접 객체를 생성 할 수 없음.

        // 업캐스팅된 상태로 생성
        // 변수타입은 부모타입, 실제객체는 자식객체
        Character warrior1 = new Warrior("전사(1)");
        Character warrior2 = new Warrior("전사(2)");
        warrior1.attack(warrior2);

        // 실습 Character를 상속받는
        // 1. Mage class를 정의해주세요 - 체력80, 공격력30
        // attack - 마법미사일
        // 2. Archer class를 정의해주세요 - 체력100, 공격력20
        // attack - 다중화살
        Character mage1 = new Mage("법사(1)");
        Character archer1 = new Archer("궁수(1)");

        Character[] party = {warrior1, mage1, archer1};

        for (Character member : party) {
            // attack() 메서드가 항상 존재하도록 설계
            // 오버라이딩이 강제되었으니까
            member.attack(warrior2);
            // 추상클래스를 상속 -> attack() 오버라이딩 강제
            // -> 다형성이 보장
        }

    }
}
