package _10_Class;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스: 내가 직접 정의하는 참조자료형

        // new: 참조자료형이 저장될 heap메모리 공간 확보
        Student st1 = new Student(); // st1은 heap주소를 저장
        st1.name = "홍길동";
        st1.kor = 90;
        st1.eng = 80;
        st1.math = 70;
        System.out.println(st1.name); // 데이터를 읽겠다

        // new 연산시 실제 heap에 데이터 묶음을 저장할 구역만듬
        // 그것을 객체라고한다. 혹은 인스턴스라고 한다.
        Student st2 = new Student();
        st2.name = "홍길동";
        st2.kor = 90;
        st2.eng = 80;
        st2.math = 70;

        Student[] students = {st1, st2};

        // Car 클래스를 정의해 주세요
        // 필드: brand(회사명), model(모델명), year(생산연도)
        // 서로다른 car 객체를 생성해주세요
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2023;

        Car car2 = new Car();
        car2.brand = "테슬라";
        car2.model = "Model Y";
        car2.year = 2024;

        Student st3 = new Student("김길동", 100, 90, 100);
        // 둘다 객체의 주소를 넘기는 것
        Student.printInfo(st3); // 직접넘기기
        st3.printInfo(); // this로 넘기기

       Student[] sts = {st1, st2, st3};
       for (Student st : sts) {
           st.printInfo();
       }

    }
}
