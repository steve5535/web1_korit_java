package _14_Inheritance;

public class CarMain {
    // 다형성 : 코드는 동일, 동작은 상이
    public static void makeDrive(Car[] cars) {
        for (Car car : cars) {
            car.drive();
        }
    }

    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        GasCar gCar = new GasCar();

        eCar.move(); // 부모의 move()
        gCar.move(); // 오버라이딩된 자식의 move()

        // 둘다 오버라이딩 된 자식의 메서드 호출 중
        eCar.drive();
        gCar.drive();
        // 다형성 -> 동일한 메서드를 호출하는데, 동작이 다른 것
        // 어떻게 하면 다형성을 안정하게 구현할 수 있을까?
        // 오버라이딩을 강제하면?
        // 상속받은 클래스에서는 강제로 같은 시그니쳐의 메서드를 가지게됨
        // -> 강제한 메서드는 호출이 안전하게 보장받는다.

        // 캐스팅 - (상속) 자료형변경
        // 1. 업캐스팅: 자식클래스 객체 -> 부모클래스 타입으로 볼래
        // 2. 다운캐스팅: 부모클래스 객체 -> 자식클래스 타입으로 볼래
        // -> 업캐스팅되었던 객체를 다식 원복한다.

        ElectricCar eCar2 = new ElectricCar();
        Car car1 = (Car) eCar2; // 업캐스팅
        // car1.chatge(); 전기차만의 메서드를 사용할 수 없음

        // 오버라이딩된 자식의 메서드가 호출
        // 메서드가 호출되는 2가지 방식
        // 1. 컴파일시점에 결정
        // 2. 런타임시점에 결정 -> 오버라이딩 메서드는 런타임에 결정됨
        // -> new 해서 실제 생선된 객체기준으로 호출됨.
        car1.drive(); // super의 drive (x)

        // 생성(new)은 자식객체, 변수 타입은 부모타입
        Car car2 = new GasCar(); // 업캐스팅

        // 다운캐스팅은 위험하다
        GasCar gCar2 = (GasCar) car2;
        // GasCar gCar3 = (GasCar) car1; // 전기차 객체를 잘못 다운캐스팅

        // instanceof 연산자
        // 객체 instanceof 클래스
        // 왼쪽객체가 오른쪽 타입정보를 가지고 있는가?
        System.out.println(car1 instanceof ElectricCar);
        System.out.println(car1 instanceof Car);
        System.out.println(car1 instanceof GasCar);

        if(car1 instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car1;
        } else if (car1 instanceof GasCar) {
            GasCar gasCar = (GasCar) car1;
        }

        Car[] cars = {car1, car2}; // 서로다른 자식객체들이 업캐스팅되어서 배열로 관리됨
        makeDrive(cars);

    }
}
