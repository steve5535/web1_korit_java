package _18_Singleton;

public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        // 같은 주소일까?
        System.out.println(l1 == l2);

        Config c1 = Config.getInstance();
        Config c2 = Config.getInstance();

        System.out.println(c1 == c2);

        c1.setMode(Config.PRODUCTION_MODE);

        // 설정값을 공유할 수 있음
        System.out.println(c2.getMode());

    }
}
