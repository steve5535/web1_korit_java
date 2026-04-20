package _08_Array;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.print("이메일을 입력해 주세요 >");
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        // 1. 이메일이 유효한다? - "@"가 있는가?, "."이 있는가?
        // 유효하면, "유효합니다" 출력
        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");

        if (hasAt && hasDot) {
            System.out.println("유효합니다");
        }

        // 2. 사용자 이메일 아이디 추출해서 출력
        int idxAt = email.indexOf("@");
        String emailId = email.substring(0, idxAt);
        System.out.println("아이디: " + emailId);

        // 3. java@naver.com -> 도메인이름(naver)추출
        int idxDot = email.indexOf(".");
        String domainName = email.substring(idxAt + 1, idxDot);
        System.out.println("도메인 이름: " + domainName);

        // 특정 index의 char를 추출
        char firstChar = domainName.charAt(0);
        System.out.println(firstChar);
    }
}
