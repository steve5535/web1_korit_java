package _12_Static;

import java.io.FilterOutputStream;

public class StaticMain {
    public static void main(String[] args) {

        StaticData sd1 = new StaticData(1);
        System.out.println(sd1.count); // 1
        System.out.println(sd1.staticCount);
        StaticData sd2 = new StaticData(2);
        System.out.println(sd2.count); // 1
        System.out.println(sd2.staticCount);
        StaticData sd3 = new StaticData(3);
        System.out.println(sd3.count); // 1
        System.out.println(sd3.staticCount);

        // staticCount는 heap에 없음.
        // 별도의 메모리 공간에 존재(메서드영역 - method area)
        // 클래스가 저장하는 정보
        // 클래스로 부터 만들어진 모든 객체들은 해당 정보를 공유
        System.out.println(StaticData.staticCount); // 권장

        System.out.println("==========================");
        Ticket ticket1 = new Ticket();
        System.out.println(ticket1.getNumber());
        Ticket ticket2 = new Ticket();
        System.out.println(ticket2.getNumber());


    }
}
