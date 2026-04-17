package _01_Print;

public class TypeCasting {
    public static void main(String[] args) {
        // (자료)형변환: 데이터 타입을 다른 타입으로 변경

        // 큰 -> 작은: 넘칠 수 있음 -> 데이터유실 가능성(명시적 형변환)
        // 작은 -> 큰: 데이터유실 가능성 x(자동 형변환

        // 작은 -> 큰
        int intNum = 10; // 4바이트
        long lonNum; // 8바이트
        double doubleNum; // 8바이트

        lonNum = 10; // 10L로 자동변환됨
        doubleNum = intNum; // 10.0으로 자동변환됨

        // 큰 -> 작은(오버플로우)
        long maxIntNum = 2_147_483_647L; // int 최댓값
        long overIntNum = maxIntNum + 1;

        int intNum2 = (int)overIntNum;
        System.out.println(intNum2); // -21억~21억

        // 숫자 -> 문자열
        String numberStr1 = "" + 12;
        String numberStr2 = Integer.toString(12);

        // 문자열 -> 숫자
        int number = Integer.parseInt("12");
        double d = Double.parseDouble("12");

    }
}
