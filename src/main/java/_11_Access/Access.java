package _11_Access;

public class Access {
    // 10x10 바둑판
    // 접근제어자 - (클래스), 메서드, 필드 모두 동일한 작용
    // 데이터 보호용
    /*
        1. public - 어디서든 참조(.) 가능
        2. protected - 같은패키지&&상속관계 일때만 참조(.) 가능
        3. default - 같은패키지만 참조(.) 가능, 접근제한자없을때 기본값
        4. private - 해당 클래스 파일 내부에서만 참조(.) 가능
     */
    private int x;
    private int y;


    public Access(int x, int y) {
        // x, y를 내가 원하는 값이 들어가게 강제
        // return (x) -> Exception(예외)발생

        this.x = x;
        this.y = y;
    }

    public Access() {
        this(5, 5); // 같은 이름의 생성자 호출
        // this != this() 전혀 무관한 문법
        // 제약사항: 생성자의 가장 첫줄에 작성
    }

    // getter
    public int getX() {
        return this.x;
    }

    // setter
    public void setX(int n) {
        if (n < 0 || n > 10) {
            System.out.println("0~9까지만 허용");
            return;
        }

        this.x = n;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0 || y > 10) {
            System.out.println("0~9까지만 허용");
            return;
        }

        this.y = y;
    }
}
