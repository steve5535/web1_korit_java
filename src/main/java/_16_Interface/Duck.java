package _16_Interface;

// 인터페이스는 다중이식이 가능
// 상속은 다중상속이 불가능
public class Duck implements Animal, Flyable {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리가 파다닥");
    }
}
