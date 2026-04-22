package _10_Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        // 자리만 미리 만들어두면,
        // 원시자료형은 기본값이 배정됨
        // 참조자료형은 null이 배정됨

        int count = 0;
        while (true) {
            System.out.println("-- 학생기록부 --");
            System.out.println("1. 학생 조회");
            System.out.println("2. 학생 등록");
            System.out.println("q. 종료");

            System.out.print("메뉴 선택(1~2 or q) >");
            String choice = scanner.nextLine();
            if (choice.equals("1")) { // 학생조회

            } else if (choice.equals("2")) { // 학생등록
                System.out.print("학생이름 >");
                String name = scanner.nextLine();
                System.out.print("국어점수 >");
                int kor = scanner.nextInt();
                System.out.print("영어점수 >");
                int eng = scanner.nextInt();
                System.out.print("수학점수 >");
                int math = scanner.nextInt();

                // 객체로 조합
                Student student = new Student(name, kor, eng, math);
                students[count] = student;
                count++;

            } else if (choice.equals("q")) { // 종료
                System.out.println("종료");
                break;
            } else {
                System.out.println("다시 입력하세요");

            }
        }
    }
}
