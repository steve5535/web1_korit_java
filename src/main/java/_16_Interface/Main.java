package _16_Interface;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Duck duck = new Duck();

        Manager manager = new Manager();

        // duck의 현재 타입: Duck
        // makeFly는 매개변수로 Flyable타입을 받음
        // -> 자동을 캐스팅되서 전달된다
        manager.makeFly(duck);
        manager.makeSound(dog);
        manager.makeSound(duck);
    }
}
