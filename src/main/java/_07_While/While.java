package _07_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
            while(조건식-boolean데이터) {
                // 조건이 true인동안 반복될 코드
            }
            // 조건이 false가 되면 반복종료
            // break를 읽어도 탈출
            for(int i = 0; i < 반복횟수; i++)
            while(조건식)
         */

        // 1~100 합계 - for문이 더 적절
        int sum = 0;
        int i = 1;
        while (i <= 100) { // i가 101이 되는순간 false
            sum += i; // sum = sum + i;
            i++;
        } // (조건검사 -> 코드실행) x n
        System.out.println(sum);

        // while이 적절한 경우
        // 반복횟수, 갯수 불분명할 때

        // boolean isLogin = true;
        Scanner scanner = new Scanner(System.in);

        while (true) { // isLogin이 false일때까지
            System.out.println("로그인 상태입니다.");
            System.out.print("로그아웃 하시겠습니까?(y/n) >");
            String command = scanner.nextLine();

            // 실습) "y" 혹은 "n"이 아닌 다른 무언가를 입력하면
            // "잘못 입력하셨습니다 다시 입력하세요" 출력!
            // 다시입력받게, 단, 입력하신 선택: 은 출력되면 안됨!

            // 문자열.toLoweCase() -> 문자열을 소문자로 변환
            command = command.toLowerCase();
            // 문자열.trim() -> 좌우공백(스페이스바)을 제거
            command = command.trim();

            if (!(command.equals("y") || command.equals("n"))){
                System.out.println("잘못 입력하셨습니다 다시 입력하세요");
                continue;
            }

            System.out.println("입력하신 선택 :" + command);
            // isLogin = !command.equals("y");
            if (command.equals("y")) {
                break;
            }





        }
    }
}
