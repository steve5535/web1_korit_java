package _13_Final;

public class FinalMain {
    public static void main(String[] args) {
        // 변수에 final 지정가능
        // 1회만 초기화 할 수 있음
        final int data1 = 10;
        // data1 = 20;
        final int data2;
        data2 = 20;
        // data2 = 30;

        // 객체를 담은 변수에 final 선언
        final FinalStudent st1 = new FinalStudent("김자바", 001, 20);

        st1.setAge(21);
        st1.printInfo("자바고");
        // 왜 final인데, 객체의 상태가 변경될 수 있을까?
        // 결론: final은 스택의 값을 변경하지 못하게 막는 것

        // final로 재대입을 막고있는데, 막는 것은 컴파일러

        // 매직넘버, 매직스트링: 하드코딩되어 있는 숫자, 문자열
        // 이 숫자(문자열)이 뭘 의미하는가? 궁금해지면
        System.out.println("게임이름: " + Constant.GAME_NAME);
        System.out.println("게임모드: " + Constant.GAME_MODE);
        System.out.println("플레이어 수: " + Constant.MAX_PLAYER_COUNT);

        int playerLevel = 18; // 외부 입력값

        if (playerLevel + 1 > Constant.MAX_LEVEL) {
            System.out.println("이미 최대레벨에 도달했습니다");
        } else {
            playerLevel++;
        }

        // 물건구입
        int price = 100000; // 외부입력값

        // 5만원이 넘어가면 10프로 할인된 가격을 출력
        // 상수를 사용해서 5만원(기준), 10프로(할인율)
        double discountPrice;

        if (price > Constant.DISCOUNT_THRESHOLD) {
            double discountAmount = price*Constant.DISCOUNT_RATE;
            discountPrice = price - discountAmount;
        } else {
            discountPrice = price;
        }
        System.out.println(discountPrice);

    }
}
