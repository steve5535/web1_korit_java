package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 랜덤
        Random random = new Random();

        // 1이상 11미만 정수 중 랜덤 하나 뽑은 후, 대입
        int randomNum = random.nextInt(1, 11);

        System.out.println(randomNum);

        while (true) {
            System.out.print("숫자 입력 >");
            int myGuess = scanner.nextInt();

            if (myGuess == randomNum) {
                System.out.println("정답입니다: " + myGuess);
                break;
            }

            System.out.println("다시 입력하세요!");
        }

        // 1~100사이 랜덤숫자 뽑은 후, 대입
        int randomInt = random.nextInt(1, 101);

        // 1. 1~100사이 정수입력받기
        // 2. 입력값 > 랜덤값 "down" 출력
        // 입력값 < 랜덤값 "up" 출력
        // 입력값 == 랜덤값 "정답입니다" 출력 후 탈출
        while (true) {
            System.out.print("1~100사이의 숫자를 입력하세요 >");
            int inputNum = scanner.nextInt();

            // 입력값 검증(1~100 값)
            if (inputNum < 1 || inputNum > 100) {
                System.out.println("1~100사이 값을 입력하세요");
                continue;
            }

            if (inputNum > randomInt) {
                System.out.println("down");
            } else if (inputNum < randomInt) {
                System.out.println("up");
            } else {
                System.out.println("정답입니다");
                break;
            }

        }
    }
}
