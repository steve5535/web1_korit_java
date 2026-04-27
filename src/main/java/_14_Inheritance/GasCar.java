package _14_Inheritance;

public class GasCar extends Car {
    private int fuel;

    public GasCar() {
        this.fuel = 100;
    }

    public GasCar(String brand, int year, int fuel) {
        super(brand, year);
        this.fuel = 100;
    }

    // 메서드 오버라이딩(overriding)
    // 부모의 메서드와 동일한 시그니처 선언
    @Override // @: 어노테이션
    public void move() {
        System.out.println("가스차가 이동합니다");
    }

    @Override
    public void showInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("출시연도: " + year);
        System.out.println("연료: " + fuel);
    }

    @Override
    public void drive() {
        System.out.println("가스차로 드라이브 중");
    }

}
