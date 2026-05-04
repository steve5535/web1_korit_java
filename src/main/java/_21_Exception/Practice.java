package _21_Exception;

import java.util.Scanner;

public class Practice {
    public static String getEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일을 작성하세요 >");
        String email = scanner.nextLine();
        // 1. 커스텀예외를 만들어주세요 - unchecked
        // InvalidEmailException
        // email에 "@"가 없으면 예외를 발생 - 문자열.contains("@")
        // -> 이메일에 @가 없습니다.
        if (!email.contains("@")) {
            throw new InvalidEmailException("이메일에 @가 없습니다");
        }
        // email에 "."이 없으면 예외를 발생 - 문자열.contains(".")
        // -> 이메일에 .이 없습니다.
        if (!email.contains(".")) {
            throw new InvalidEmailException("이메일에 .가 없습니다");
        }
        return email;

    }

    public static void main(String[] args) {
        // try - catch - 커스텀예외를 catch
        try {
            String mail = getEmail();
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
