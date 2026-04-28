package _15_Abstract;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(this.name + "이 " + targetName + "에게 다중화살을 시전합니다");
        target.receiveDMG(target.attackDMG);
        System.out.println(targetName + "가 " + this.attackDMG + "의 데미지를 받았습니다");
    }
}
