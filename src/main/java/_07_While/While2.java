package _07_While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        /*
            while(조건식) {} : (조건 -> 코드실행) x n
            do {} while(조건식) : (코드실행 -> 조건) x n

            - 최소 한번은 실행되는 반복문
        */

        // 메뉴선택시
        Scanner scanner = new Scanner(System.in);
        int myChoice;
        int balance = 100000;

        do {
            System.out.println("--메뉴선택--");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액확인");
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요 >");
            myChoice = scanner.nextInt();

            if(myChoice == 1) { // 입금
                System.out.print("입금할 금액 >");
                int money = scanner.nextInt();
                balance += money;
                System.out.println(money + "원 입금완료");
            } else if (myChoice == 2) { // 출금
                // 출금 구현(잔액부족시, "잔액이 부족합니다" 출력)
                System.out.print("출금할 금액 >");
                int money = scanner.nextInt();
                if (money > balance) {
                    System.out.println("잔액이 부족합니다");
                } else {
                    balance -= money;
                    System.out.println(money + "원 출금완료");
                }
            } else if (myChoice == 3) { // 잔액확인
                System.out.println("잔액: " + balance + "원");
            }

        } while (myChoice != 0); // myChoice == 0이면 출력

        System.out.println("ATM 종료");
    }
}
