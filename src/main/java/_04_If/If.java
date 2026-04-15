package _04_If;

public class If {
    public static void main(String[] args) {
        // if문 - 코드 분기 목적으로 사용하는 제어문법
        int height = 130;
        int age = 23;
        // if(boolean데이터) {
        //      boolean이 true면 실행되는 코드
        // }
        if(height > 120) {
            System.out.println("탑승가능 합니다");
        }

        if(true) {
            System.out.println("저는 항상 실행됩니다");
        }

        if(height >= 120 && age < 14) {
            System.out.println("탐승가능 합니다");
        }

        if(age > 20) {
            System.out.println("성인입니다");
        } else { // 위의 조건들이 모두 false일때
            System.out.println("미성년자입니다");
        }

        // if ~ else if ~ else 문
        // 위에서부터 아래로 검사함(동시에 여러조건을 검사하는것이 아니다)
        // true가 연산되면, 해당 블럭코드를 실행하고 탈출
        // 오름차순, 내림차순으로 작성해야한다
        age = 12;
        if(age <= 7) {
            System.out.println("유치원 갑니다");
        } else if (age <= 13) { // 위의 조건들이 false age > 7
            System.out.println("초등학교 갑니다");
        } else if (age <= 16) { // age > 13
            System.out.println("중학교 갑니다");
        } else if (age <= 19) {
            System.out.println("고등학교 갑니다");
        } else {
            System.out.println("성인입니다");
        }

        // 내가 정한 규칙(비즈니스로직)에서 조건문을 작성할 때
        boolean isLogin = false; // 로그인x
        boolean isBanned = true; // 밴계정o

        if(!isLogin) { // 로그아웃이라면
            System.out.println("로그인이 필요합니다");
        } else if (isBanned) {
            // 위 조건이 false일때 실행 -> 로그인때만 실행
            System.out.println("정지된 계정입니다");
        }

        // 실습1) num1의 절댓값을 출력
        int num1 = -12; // 12로 변경했을때도 12출력
        if (num1 >= 0) {
            System.out.println(num1);
        } else {
            System.out.println(num1 * -1);
        }

        // 실습2) num2, num3 중 큰 값을 출력
        int num2 = 10;
        int num3 = 5;
        if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        // 실습3) bmi 계산
        // bmi = 체중(kg) / 키(m) * 키(m)
        double weight = 70.0;
        double height2 = 174 / 100.0; // int와 double이 연산되는 결과는 double
        // 연산자 우선순위: () > 대입
        // 우선순위 동일하면, 왼쪽부터 연산
        double bmi = weight / (height2 * height2);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 25) {
            System.out.println("정상");
        } else if (bmi < 30) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }


    }
}
