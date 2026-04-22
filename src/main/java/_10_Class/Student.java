package _10_Class;

// 내가 직접 정의하는 참조자료형
public class Student {
    // 필드, 멤버, 속성
    String name;
    int kor;
    int eng;
    int math;

    // 생성자 - new연산시, 호출되는 메서드
    // 엄밀히 말하면, 메서드 x
    // 리턴명시x, 클래스와 동일한 이름
    public Student() {
        // 매개변수 하나도 없는 생성자
        // 기본생성자
        System.out.println("기본생성자 호출됨");
    }

    // 생성자도 오버로딩이 가능함
    public Student(String name, int kor, int eng, int math) {
        // 자바에서 static이 없는 메서드는
        // this라는 매개변수가 존재함
        // this는 객체의 주소를 전달받는 매개변수
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 인스턴스 메서드(static이 아닌메서드)
    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.kor);
        System.out.println("영어: " + this.eng);
        System.out.println("수학: " + this.math);
        System.out.println("총점: " + this.getTotalScore());
        System.out.println("평균점수: " + this.getAvgScore());
    }

    public static void printInfo(Student st) {
        System.out.println("이름: " + st.name);
        System.out.println("국어: " + st.kor);
        System.out.println("영어: " + st.eng);
        System.out.println("수학: " + st.math);
    }

    // student 객체의 총점을 리턴하는 인스턴스 메서드
    public int getTotalScore() {
        int totalScore = this.kor + this.eng + this.math;
        return totalScore;
    }
    // student 객체의 평균점수를 리턴하는 인스턴스 메서드
    public double getAvgScore() {
        double avgScore = this.getTotalScore() / 3.0;
        return avgScore;
    }
    // -> printInfo 인스턴스메서드에 총점과 평균점수 출력코드 추가






}
