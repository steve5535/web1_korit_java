package _12_Static;

// static: 정적(고정)
public class StaticData {
    // id, count -> 인스턴스 필드
    private int id;
    public int count = 0;

    // 클래스에 저장되는 필드(heap에 없음)
    public static int staticCount = 0;

    public StaticData(int id) {
        this.id = id;
        staticCount++;
        count++;
    }

    // 스태틱 메서드
    // -> 유틸성
    public static void a() {
        // 스태틱은 스태틱만 사용가능
        staticCount++;
    }

    public void b() {
        staticCount++; // 이미 메모리에 있음
        this.count++; // new 이후 시점
    }

    // 스태틱필드 -> final과 함께 상수를 정의할때 사용
    // 스태틱메서드 -> 유틸리티 메서드


}
