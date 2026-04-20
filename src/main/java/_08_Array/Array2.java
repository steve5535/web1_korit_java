package _08_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 배열 복사
        int[] original = {1, 2, 3, 4, 5};

        // 배열 내부 전체를 조회
        // 유틸클래스
        System.out.println(Arrays.toString(original));

        // "=" 대입연산: stack값을 복사하여 대입
        int[] copy1 = original; // (얕은)복사
        System.out.println(Arrays.toString(copy1));

        // 깊은복사: heap에 새로운 메모리 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(original, original.length);

        int[] copy3 = new int[original.length]; // original 칸만큼
        for (int i = 0; i < original.length; i++) {
            copy3[i] = original[i]; // 같은 칸에 같은 데이터를 복사
        }

        original[0] = 999; // original의 0번칸에 999덮어쓰기
        System.out.println(Arrays.toString(original));

        // original 변경 -> copy도 변경
        // 대입연산으로 주소만 복사했기 때문
        System.out.println(Arrays.toString(copy1));

        // original 변경 -> copy2는 보존
        // heap에 새로운 주소를 만들어서 실제 값 복사
        System.out.println(Arrays.toString(copy2));



    }
}
