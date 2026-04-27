package _14_Inheritance;
// 상속
// 1. 코드 압축
// 2. 다형성 - 구현 - 캐스팅
public class Car {
    // 공통필드, 공통메서드 추려낸 부모 클래스 -> 추상화

    protected int year;
    protected String brand;

    public Car() {
        System.out.println("부모의 기본생성자 호출!");
        this.brand = "기본브랜드";
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // 공통메서드
    public void move() {
        System.out.println("기본자동차가 이동하고 있습니다");
    }

    public void showInfo() {
        System.out.println("기본자동차의 정보 출력");
        System.out.println("브랜드: " + brand);
        System.out.println("생산연도: " + year);
    }

    public void drive() {
        // 빈껍질
    }

}
