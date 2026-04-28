package _15_Abstract;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이 " + targetName + "에게 마법미사일을 시전합니다");
        target.receiveDMG(this.attackDMG);
        System.out.println(targetName + "가 " + this.attackDMG + "의 데미지를 받았습니다");
    }
}
