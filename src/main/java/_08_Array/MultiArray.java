package _08_Array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // 다중배열 - 배열안에 배열이 있는 구조

        // 영화관 좌석
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // seats는 String[]의 주소값들을 저장
        String[][] seats = {seatA, seatB, seatC};

        String[] aSeat = seats[0];
        String A2 = aSeat[1];
        A2 = seats[0][1];

        String[][] seats2 = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 실습) A4 / C5를 seats2로 접근하여 출력해주세요
        System.out.println(seats2[0][3]);
        System.out.println(seats2[2][4]);
        // 실습2) B3를 "B-THREE"로 변경
        seats2[1][2] = "B-THREE";

        // Arrays.toString()은 주소가 있으면, 한번만 찾아가서 확인
        System.out.println(Arrays.toString(seats2));
        // seats는 주소 -> 주소들

        // 실제값이 나올때까지 찾아가서 확인
        System.out.println(Arrays.deepToString(seats2));


        // 이중배열과 for문
        // int[] -> for문 한번으로 int
        // int[][] -> for문 한번으로 int[]


        for (int i = 0; i < seats2.length; i++) {
            String[] seat = seats2[i];
            for (int j = 0; j < seat.length; j++) {
                String seatName = seat[j];
                System.out.println(seatName);
            }
        }
        for (int i = 0; i < seats2.length; i++) {
            for(int j = 0; j < seats2[i].length; j++) {
                System.out.println(seats2[i][j]);
            }
        }

        int[][] numArrs = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // numArrs 내부에 실제 int들을 읽으면서
        int evenSum = 0;
        int count3 = 0;

        for (int i = 0; i < numArrs.length; i++) {
            int[] numArr = numArrs[i];
            for (int j = 0; j < numArr.length; j++) {
                int num = numArr[j];
                // 1. 짝수합을 구해주세요
                if (num % 2 == 0) {
                    evenSum += num;
                }
                // 2. 3의 배수의 갯수를 구해주세요
                if (num % 3 == 0) {
                    count3++;
                }
            }
        }
        System.out.println(evenSum);

        System.out.println(count3);



    }
}
