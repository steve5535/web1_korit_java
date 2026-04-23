package _11_Access;

public class AccessMain {
    public static void main(String[] args) {
        Access ac = new Access(5, 6);

        // private로 막혀있음
        int x = ac.getX(); // 간접조회
        System.out.println(x);
        ac.setX(8); // 간접변경
        x = ac.getX();
        System.out.println(x);

        Bottle bottle = new Bottle();
        bottle.drink(100);
        bottle.printCurrenWater();
        bottle.fill(170);
        bottle.printCurrenWater();
    }
}
