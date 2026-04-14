package _03_Scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 페이지네이션
        // 스캐너를 통해 게시글갯수를 입력받으세요
        System.out.print("개시글 갯수를 입력하세요 >");
        int postCount = scanner.nextInt();
        int viewCount = 20; // 한페이지당 보여주는 게시글 수
        // 총 페이지의 갯수를 구하여 출력 해 주세요
        int pageCount = postCount % viewCount == 0
                ? postCount / viewCount
                : postCount / viewCount + 1;
        System.out.println("총페이지: " + pageCount);


    }
}
