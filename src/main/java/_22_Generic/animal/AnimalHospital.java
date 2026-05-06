package _22_Generic.animal;

// 상한경계설정
// T extends A: T는 A타입이거나, A를 상속받은 타입이어야함.
public class AnimalHospital<T extends Animal> {
    private T animal;

    public void makeSound() {
        animal.sound(); // Object까지 업캐스팅 x Animal까지만
    }

    public T getBigger(T a1, T a2) {
        // 다운캐스팅 안전하게 하려고 했더니
        // Object까지 업캐스팅되어버려서, getter정보 누락
        T biggerOne = a1.getSize() > a2.getSize() ? a1 : a2;
        return biggerOne;
    }

}
