package _15_Abstract;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 120, 25);
    }

    @Override // 추상메서드는 상속시 구현이 강제(오버라이딩 강제)
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이 " + targetName + "에게 강력한 강타를 시전합니다");
        target.receiveDMG(this.attackDMG);
        System.out.println(targetName + "가 " + this.attackDMG + "의 데미지를 받았습니다");
    }
}
