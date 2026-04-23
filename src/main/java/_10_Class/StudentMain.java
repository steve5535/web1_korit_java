package _10_Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10;

        Student[] students = new Student[max];
        // 자리만 미리 만들어두면,
        // 원시자료형은 기본값이 배정됨
        // 참조자료형은 null이 배정됨

        int count = 0;
        while (true) {
            System.out.println("-- 학생기록부 --");
            System.out.println("1. 학생 조회");
            System.out.println("2. 학생 등록");
            System.out.println("3. 이름으로 조회");
            System.out.println("q. 종료");

            System.out.print("메뉴 선택(1~3 or q) >");
            String choice = scanner.nextLine();
            if (choice.equals("1")) { // 학생조회
                if (count == 0) {
                    System.out.println("등록학생이 없습니다.");
                    continue;
                }

                for (Student st : students) {
                    if (st == null) {
                        break;
                    }
                    st.printInfo();
                }


            } else if (choice.equals("2")) { // 학생등록
                if (count >= max) {
                    System.out.println("정원 초과입니다");
                    continue;
                }

                System.out.print("학생이름 >");
                String name = scanner.nextLine();
                System.out.print("국어점수 >");
                int kor = scanner.nextInt();
                System.out.print("영어점수 >");
                int eng = scanner.nextInt();
                System.out.print("수학점수 >");
                int math = scanner.nextInt();

                scanner.nextLine();

                // 객체로 조합
                Student student = new Student(name, kor, eng, math);
                students[count] = student;
                count++;

            } else if (choice.equals("q")) { // 종료
                System.out.println("종료");
                break;
            } else if (choice.equals("3")) { // 이름으로 조회
                if (count == 0) {
                    System.out.println("등록된 학생이 없습니다");
                    continue;
                }

                System.out.print("검색할 이름 입력 >");
                String target = scanner.nextLine();
                boolean isFound = false;
                for (int i = 0; i < count; i++) {
                    Student st = students[i];
                    if (st.name.equals(target)) {
                        st.printInfo();
                        isFound = true;
                        break;
                    }
                }
                if(!isFound) {
                    System.out.println("해당 이름의 학생은 없습니다");
                    continue;
                }

            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }
}
