package _16_Interface;

public class Manager {
    // 의존성 / 결합도
    // Dog 클래스는 Manager를 의존하는가? x
    // Manager 클래스는 Dog를 의존하는가? x
    // Dog는 Animal 의존중
    // Manager도 Animal 의존중
    // 구체적인 클래스끼리 의존하는게 아니라, 인터페이스를 통해 작동하는
    // -> 결합도가 낮은 구조

    // 객체지향의 5원칙 - S O L I D
    // DIP - 의존성역전의 원칙

    // 인터페이스를 이식받은 구현체를 업캐스팅해서 전달받음
    public void makeSound(Animal animal) {
        animal.sound();
    }

    public void makeFly(Flyable flyable) {
        flyable.fly();
    }
}
