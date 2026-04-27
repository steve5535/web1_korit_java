package _14_Inheritance;

// extends 상속받을 클래스이름
public class ElectricCar extends Car {
    // brand, year -> 필드를 가지고 있게 됨
    private int battery;

    // 자식의 기본생성자
    // 부모의 필드를 항상 먼저 초기화한다
    // super()는 생략가능 부모의 기본생성자는 생략가능
    public ElectricCar() {
        super(); // 부모의 기본생성자 호출
        this.battery = 100;
    }

    // super. -> 부모의 메서드나 부모의 필드접근
    // this는 super를 포함
    // 메서드: 부모클래스 기준에서 호출하겠다.
    public ElectricCar(String brand, int year) {
        super(brand, year);
        this.battery = 100;
    }

    public void moveWithInfo() {
        super.move(); // 부모의 move를 명시적으로 호출
        System.out.println("배터리 잔량: " + battery);
        this.battery -= 10;
    }

    public void charge() {
        System.out.println("배터리 충전할게요");
        this.battery = 100;
    }

    @Override
    public void drive() {
        System.out.println("전기차로 드라이브 중");
    }

}
