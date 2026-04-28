package _16_Interface;

// 기능만 명세한 인터페이스는 extends대신 implements
public class Dog implements Animal {
    // 인터페이스 -> 전체가  추상 메서드
    // 이식을 받으면 강제로 오버라이딩 해야함

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 우다다닥");
    }
}
