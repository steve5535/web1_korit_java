package _15_Abstract;

// 1. 오버라이딩할 부모의 메서드는 다형성관점에서 구현이 필요없음
// 2. 상속했을 때, 오버라이딩 강제해야함

// 추상클래스: 추상메서드를 하나 이상 포함하는 클래스
// 추상메서드: 메서드 시그니처만 정의, 구현(body) 생략
public abstract class Character {
    protected String name;
    protected int HP;
    protected int attackDMG;

    public Character(String name, int HP, int attackDMG) {
        this.name = name;
        this.HP = HP;
        this.attackDMG = attackDMG;
    }

    // 공통메서드
    public void receiveDMG(int DMG) {
        this.HP -= DMG;
        if (this.HP <= 0) {
            this.HP = 0;
            System.out.println(this.name + "이 쓰러졌습니다.");
        }
    }

    // Character는 기본틀
    // attack은 구현부가 필요가 없음 -> 오버라이딩 할거임
    // abstract를 작성하면, 메서드의 구현부가 없어짐.
    public abstract void attack(Character target);

    public String getName() {
        return name;
    }
}
