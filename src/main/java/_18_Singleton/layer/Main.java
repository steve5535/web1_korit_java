package _18_Singleton.layer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 스프링부트 맛보기
        /*
            Controller - 사용자의 데이터를 받아주는 창구
            -> www.naver.com : 서버주소
            -> www.naver.com/news
            서버주소 이후에 등장하는 /는 컨트롤러 경로
            Service - 비즈니스 로직 작성
            Repository - 데이터베이스 연결(+쿼리)
         */

        // 1. 사용자입력 - 스캐너
        Scanner scanner = new Scanner(System.in);

        // 2. 의존성주입 main에서 싱글톤 객체를 생성 및 조립

        // 인터페이스를 통해서 결합도를 낮추는것이 권장된다. -> 변경에 용이
        UserRepo userRepository = UserRepository.getInstance();
        // UserRepo userRepoJDBC = new UserRepoJDBC();
        UserService userService = UserService.getInstance(userRepository);

        while (true) {
            System.out.println("=== 회원가입 서버 ===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원목록");
            System.out.println("0. 종료");

            System.out.print("메뉴 선택 >");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 엔터키

            if (menu == 1) {
                System.out.print("아이디 입력 >");
                String username = scanner.nextLine();
                System.out.print("비밀번호 입력 >");
                String password = scanner.nextLine();

                SingUpReqDto reqDto = new SingUpReqDto(username, password);
                userService.signUp(reqDto);
            } else if (menu == 2) {
                // 로그인
                System.out.print("아이디 입력 >");
                String username = scanner.nextLine();
                System.out.print("비밀번호 입력 >");
                String password = scanner.nextLine();

                String msg = userService.signIn(username, password);
                System.out.println(msg);
            } else if (menu == 3) {
                userService.showAllUsers();
            } else if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }

    }
}
