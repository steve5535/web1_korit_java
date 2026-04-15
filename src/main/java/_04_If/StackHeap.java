package _04_If;

public class StackHeap {
    public static void main(String[] args) {
        // .java(영어) -> .class(숫자) : 컴파일러가 함
        // .class파일을 읽고 실행하는 주체: JVM
        // JVM이 OS(window or macOs)에게 명령전달

        // JVM의 메모리구조(stack + heap + a....)
        /*
            자료형 분류
            1. 첫글자가 소문자: 기본(원시)자료형
            -> int, double, char, boolean...
            2. 첫글자가 대문자: 참조자료형
            -> String, Scanner, ...클래스
            : 원시자료형들의 조합으로 이루어짐, 참조(.)가 가능하다

            1. Stack메모리
                - 기본자료형들의 실제 값이 저장됨
                - 참조자료형들의 heap주소값이 저장됨
            2. Heap메모리
                - 참조자료형들의 실제 값이 저장됨
         */

        int num1 = 10;
        int num2 = 20;
        /*
            stack(main)--
            num1: 10
            num2: 20
         */
        String str1 = "홍길동";
        String str2 = new String("홍길동");
        /*
            stack(main)--
            num1: 10
            num2: 20
            str1: 0x1000
            str2: 0x2000
            ---
            heap--
            0x1000: "홍길동"
            0x2000: "홍길동"
         */

        num2 = 10;
        System.out.println(num1 == num2); // true
        System.out.println(str1); // 홍길동
        System.out.println(str2); // 홍길동
        System.out.println(str1 == str2); // false

        // == 연산은 stack에 저장된 값을 비교
        // 문자열을 문자열.equals()를 사용한다
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("홍길동"));
        System.out.println(str2.equals(str1));

        str2 = str1; // str2에 str1의 heap주소를 대입
        System.out.println(str2 == str1); // 주소가 같아서 true인것

    }
}
