package _09_Method;

public class Overloading {
    /*
        1. 메서드는 클래스에 속해 있다.
        -> 같은 이름의 메서드가 다른 클래스에 있을 수 있음
        2. 같은 이름의 메서드가 동일 클래스 내에 선언된 경우
        -> 메서드 오버로딩
        매개변수의 자료형, 순서, 갯수가 다르면 자바가 구분
     */

    // 자바가 메서드를 구분하는 기준: 시그니처

    // printInfo, 1:String
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // printInfo, 1:String 2:int
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // printInfo, 1:int 2:String
    public static void printInfo(int age, String name) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

//    public static void printNum(int n) {
//        System.out.println("정수 메서드 호출! : " + n);
//    }

    public static void printNum(double d) {
        System.out.println("실수 메서드 호출! : " + d);
    }

    public static void main(String[] args) {
        // 호출되는 메서드는 컴파일시점에 결정된다.
        printInfo("홍길동");
        printInfo(10, "홍길동");

        // 숫자의 경우, 정확한 타입이 없으면 자동형변환이 가능한 타입을 따라간다.
        printNum(1);
        printNum(1.0);

    }
}
