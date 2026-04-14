package _02_Operator;

public class Op2 {
    public static void main(String[] args) {
        // 5. 논리연산자 - boolean타입끼리 연산
        // 연산결과도 boolean 타입

        boolean hasLicense = true;
        int age = 21;
        // &&(and연산자): 둘 다 true일때 true
        boolean canDrive = hasLicense && age > 18;

        // ||(or연산자): 둘 중 하나라도 true면 true
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestDay = isWeekend || isHoliday;

        // !(not연산자): boolean값을 반전
        boolean isLogin = true;
        boolean isLogoff = !isLogin;

        // 0 < a < 10
        int a = 5;
        boolean sample = a > 0 && a < 10;

        // 6. 삼항연산자
        // boolean데이터 ? true일때의 값 : false일때의 값
        int x = 100;
        int y = 10;
        int max = x > y ? x : y;
        System.out.println(max);

        // ? 이후의 데이터 타입이 동일 해야한다
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같아요" : "달라요";

        // 실습1) height이 restrict 이상이면
        // "탑승가능", 아니라면 "탑승불가능"
        int height = 120;
        int restrict = 150;
        String isBoarding = height >= restrict ? "탑승가능" : "탑승불가능";
        System.out.println(isBoarding);

        // 실습2) 50000이상이면 10퍼할인 가격, 아니라면 원래가격
        // 출력
        double price = 60000.0;
        double result = price >= 50000 ? price - price * 0.1 : price;
        System.out.println(price);

        // 중첩 가능 - 삼항"연산자" (결과가 값)
        age = 17;
        String ticketName = age >= 20 ? "성인요금"
                : age >= 14 ? "청소년요금"
                : "어린이요금";

    }
}
