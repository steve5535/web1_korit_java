package _11_Access;

public class Bottle {
    private int currentWater; // 현재 물의 양(ml)
    private int max = 1000; // 용량(1000ml)

    public Bottle() {
        this.currentWater = 100; // 초기값
    }


    // fill(int amount)
    public void fill(int amount) {
        if (amount > 0 && amount < max) {
            this.currentWater += amount;
            return;
        }
        System.out.println("가득 찼습니다");
    }
    // currentWater를 amount만큼 증가시키는
    // amount 음수면 x, max를 넘어갈수 없음.

    // drink(int amount)
    public void drink(int amount) {
        if (amount > 0 && amount <= this.currentWater) {
            this.currentWater -= amount;
            return;
        }
        System.out.println("물의 양이 부족합니다");
    }
    // currentWater를 amount만큼 감소시키는
    // amount 음수면 x currentWater는 음수가 될수x

    public void printCurrenWater() {
        System.out.println("현재 물의 양: " + this.currentWater);
    }
}
