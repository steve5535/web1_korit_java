package _09_Method;

public class Practice {

    // 등급을 구하는 메서드
    // 평균을 매개변수로 전달받아, 학점을 리턴
    // 90이상 A, 80이상90미만 B, 70이상80미만 C, 나머지 D
    public static String getGrade(double avg) {
        String grade = "";

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }

        return grade;
    }

    public static void printStudentInfo(String name, int[] scores) {
        // 총점
        double totalScore = 0.0;
        for (int score : scores) {
            totalScore += score;
        }
        // 평균
        double avg = totalScore / scores.length;
        // 등급
        String grade = getGrade(avg);

        // 출력
        System.out.println("이름: " + name);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + avg);
        System.out.println("등급: " + grade);
    }

    public static void main(String[] args) {
        // 학생이름, 국,영,수 점수를 배열로 매개변수로 넘기면,
        // 총점, 평균, 등급을 출력하는 메서드
        int[] scores = {80, 90, 70};
        printStudentInfo("성선혁", scores);
    }
}
