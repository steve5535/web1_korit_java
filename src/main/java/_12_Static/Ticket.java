package _12_Static;

public class Ticket {
    public static int nextNumber = 1;
    private int number;

    // new 할때마다 number가 1씩 증가된 상태로 생성되게
    // 생성자를 만들어 주세요

    public Ticket() {
        this.number = nextNumber++;
    }

    public int getNumber() {
        return number;
    }
}
