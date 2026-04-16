package _06_For;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
            반복문-for문

            for (변수선언-초기식; 조건식; 증감식) {
                반복될 코드
            }
            for문의 코드 진행 순서
            초기식 -> (조건식검사 -> true면 코드실행 -> 증감식) x n
            -> 조건식검사 결과가 false면 for 중괄호 탈출
         */

        // "안녕하세요" 5번 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }

        // 초기식 생략시
        int a = 0;
        for (; a < 5; a++) {
            System.out.println("안녕하세요");
        }
        // 중간코드
        int b = 0;
        for (; a < 10; a++) {
            b++;
        }
        System.out.println(a + b); // 출력값을 작성하시오

        System.out.println("사람" + 1);
        System.out.println("사람" + 2);
        System.out.println("사람" + 3);
        System.out.println("사람" + 4);
        System.out.println("사람" + 5);

        for (int i = 1; i <= 5; i++) {
            System.out.println("사람" + i);
        }

        // 1단계) 1~10 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 2단계) 1~10 중 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 3단계) 1~100 합한 값 출력
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 4단계) 1~100까지 수 중에서
        // 3의 배수, 5의 배수를 각각 몇개인지 출력
        int countOf3 = 0;
        int countOf5 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                countOf3 += 1;
            }
            if (i % 5 == 0) {
                countOf5 += 1;
            }
        }
        System.out.println("3의 배수 개수: " + countOf3);
        System.out.println("5의 배수 개수: " + countOf5);

        for (int i = 1; i <= 10; i++) {
            // 짝수면 -> 출력해
            // 홀수면 -> 출력하지마
            if (i % 2 != 0) {
                System.out.println("홀수발견");
                continue; // 다음반복으로 스킵
            }
            System.out.println(i); // 스킵된다면 실행불가능
        }

        // 1~10 더하다가 20이 넘어가는 순간 탈출
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += 1;
            if (sum2 > 20) {
                System.out.println("20초과! :" + sum2);
                break; // 반복중단 -> for문 중괄호 즉시탈출
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >");
        int target = scanner.nextInt();
        int sum3 = 0;
        boolean isExist = false;
        // 입력받은 숫자를 1~100 for문을 돌며 탐색
        // 매 반복마다 누적합
        // 입력받은 숫자를 찾으면, 탈출하면서 누적합 출력
        for (int i = 1; i <= 100; i++) {
            sum3 += i;
            if (i == target) {
                System.out.println(sum3);
                isExist = true;
                break;
            }
        }
        // 만약에, 못찾으면, "찾을 수 없습니다" 출력
        if (!isExist) {
            System.out.println("찾을 수 없습니다");
        }

        // 1~100 반복 중
        // 누적합
        // 누적합 2000이 넘어가고, i가 짝수인 순간 탈출하고, i와 누적합출력
        int sum4 = 0;
        for (int i = 1; i <= 100; i++) {
            sum4 += i;
            if (sum4 > 2000 && i % 2 == 0) {
                System.out.println("i: " + i + "누적합: " + sum4);
                break;
            }
        }


    }
}
