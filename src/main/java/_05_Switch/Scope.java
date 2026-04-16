package _05_Switch;

public class Scope {
    public static void main(String[] args) {
        // 스코프: 변수의 생존 범위

        // 변수가 선언된 중괄호 안쪽으로는 생존 가능하다.
        int a = 10; // main중괄호에서 선언됨
        if (true) {
            System.out.println("실행중");
            System.out.println("a: " + a); // a인식 가능
            a++;
        }

        {
            int b = 20;
            a++;
            {
                System.out.println(b);
            }
        }

        // System.out.println(b);
    }
}
