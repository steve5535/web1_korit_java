package _03_Scanner;

// import - 어딘가 작성된 코드를 빌려온다
import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // Scanner 타입의 scanner 변수 생성
        Scanner scanner = new Scanner(System.in);

        // 출력(java에서 콘솔로 데이터출력)
        System.out.println("Hello World!");

        // 입력(콘솔로 java에 데이터입력)
        // nextLine() -> 문자열입력(엔터키까지 인식)
        // nextLine만 엔터키를 잘라간다
        System.out.print("이름을 입력하세요 >");
        String name = scanner.nextLine();
        System.out.println("이름: " + name);

        System.out.print("나이를 입력하세요 >");
        int age = scanner.nextInt();
        System.out.println("나이: " + age);
        scanner.nextLine(); // 참고) 입력 버퍼에 남아있는 엔터키 제거용도

        System.out.print("주소를 입력하세요 >");
        String address = scanner.nextLine();
        System.out.println("주소: " + address);


    }
}
