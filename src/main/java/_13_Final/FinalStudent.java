package _13_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;

    // final -> 반드시 1회 초기화 되어야 하는 필드
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // setName(String name) -> 불가능
    // final필드이기 때문

    // final 매개변수 - 외부에서 들어온 값을 변경할 수 없음
    public void printInfo(final String school) {
        System.out.println("학교: " + school);
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("학번: " + this.studentId);
    }
}
