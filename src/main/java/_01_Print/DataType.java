package _01_Print;

public class DataType {
    public static void main(String[] args) {
        // 자료형(타입) + 변수
        // 변수를 사용하는 이유: 데이터 재사용

        // 자료형 변수명
        String greeting; // greeting이라는 빈박스를 생성
        // 변수 초기화(최초 대입)
        // "="은 같다는 의미가 아님.
        // 우변의 데이터를 좌변의 변수에 저장하겠다
        greeting = "hello";

        // 변수 선언 및 초기화
        String academy = "Korea IT";
        // 변수를 읽을 수 있음
        System.out.println(academy);

        // 재대입(덮어쓰기)
        academy = "IT Korea";
        System.out.println(academy); // 변경

        String ex1 = "abc";
        String ex2 = "def";
        System.out.println(ex1); // 변수사용 -> 읽어와라
        System.out.println(ex2);

        // 대입이 있을때 우변먼저 실행하고, 대입
        ex2 = ex1; // ex1읽고, ex2에 대입
        System.out.println(ex2); // ex1과 같아짐

        /*
            자바 명명법
            1. 필수규칙(문법)
                String 1name // 숫자로 시작할 수 없음
                String my name // 공백을 포함할 수 없음
                String class
                String if // 자바 예약어는 사용할 수 없음
            2. 관례(국룰)
                파스칼표기법 - MyName - 클래스명, 파일명
                카멜표기법 - myName - 변수명, 메서드명
        */

        // 1. 정수타입
        // 1111 0111 -> 8bit -> 1바이트
        byte byteNum = 127; // 1바이트
        short shortNum = 32000; // 2바이트
        int intNum = 21; // 4바이트 -21억~21억
        long longNum = 3_000_000_000L; // 8바이트

        // 2. 실수(소숫점) 타입
        float smallBox = 3.14f; // 4바이트
        double bigBox = 3.14; // 8바이트 - 소숫점 15자리

        // 3. 문자타입 - 글자 1개
        char char1 = 'A'; // 65
        char char2 = 65 + 1; // 문자는 숫자와 1:1 대응
        System.out.println(char2);

        // 4. 문자열
        String str = "안녕하세요"; // char의 연속나열

        // 5. 논리형 - true / false만 저장
        // 의문형으로 변수명 작성
        boolean isEmpty = true;
        boolean isLogin = false;
        boolean hasMoney = false;

    }
}
