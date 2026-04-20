package _08_Array;

public class Array1 {
    public static void main(String[] args) {
        // 배열(Array): 동일한 자료형의 대량 데이터를 관리하는 저장자료형

        // 배열 -> 참조자료형
        // new -> heap메모리 주소를 할당받아 오는 문법
        int[] scores = new int[5]; // int 5개 들어갈 배열
        // 각 배열의 자리는 번호(index)로 지정되어있음
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 70;
        scores[3] = 60;
        scores[4] = 50;

        System.out.println(scores); // 출력시 주소값 출력됨
        System.out.println(scores[0]); // scores의 0번칸 조회
        System.out.println(scores[1]); // scores의 1번칸 조회

        // 간단하게 배열 생성/초기화 한번에
        int[] scores2 = new int[]{90, 80, 70, 60, 99};
        int[] scores3 = {90, 80, 70, 60, 99};

        // 배열은 new될때, 용량이 정해지고, 변경할 수 없음
        // 더 큰 용량이 필요하다 -> 새로운 배열을 만들어서 복사

        // 배열은 길이(크기)를 저장하고 있음.
        System.out.println(scores3.length);

        // 배열과 for문
        for (int i = 0; i < scores3.length; i++) {
            System.out.println(scores3[i]);
        }

        // 자료형[] -> 자료형을 저장하는 배열선언
        String[] names = {"박하나", "박둘", "박셋", "박넷", "박다섯"};
        // 1. names배열로 접근해서 "박하나", "박넷" 출력 해 주세요
        System.out.println(names[0]);
        System.out.println(names[3]);
        // 2. "박다섯" -> "박오"로 수정
        names[4] = "박오";
        System.out.println(names[4]);
        // 3. names 배열에 있는 모든 이름을 순서대로 출력해주세요
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        // 향상된 for문
        // 항상 배열의 길이만큼 순회
        // 인덱스로 데이터에 접근하는 것을 막는다.
        for (String name : names) {
            System.out.println(name);
        }

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        // nums를 for문으로 순회하면서, 짝수만 출력해주세요
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // String은 참조자료형 -- char[]
        // String의 여러 기능들
        String str = "My name is Son";

        // 배열처럼 길이가 존재, index도 존재한다.
        System.out.println(str.length());
        // 특정 문자열의 포함여부 - true/false
        System.out.println(str.contains("Son")); // true
        // 특정 문자열이 몇번째 index에서 시작하는가?
        System.out.println(str.indexOf("name")); // 3
        // 부분문자열 추출 가능
        System.out.println(str.substring(3)); // 3번부터 끝까지
        System.out.println(str.substring(3, 8)); // 3번이상 8미만까지

        String pn = "991122-1234567";
        String birthDate;
        String genderCode;
        // 방법1
        birthDate = pn.substring(0, 6);
        System.out.println(birthDate);
        // 방법2
        int dashIdx = pn.indexOf("-");
        birthDate = pn.substring(0, dashIdx);
        System.out.println(birthDate);

        genderCode = pn.substring(dashIdx + 1, dashIdx + 2);
        System.out.println(genderCode);

        String[] names2 = {"김아무개", "박혁거세", "페이커", "을지문덕", "쵸비"};

        // names2를 for문으로 순회하면서, 3글자를 초과하는 이름만 출력
        for (String name : names2) {
            if (name.length() > 3) {
                System.out.println(name);
            }
        }


    }
}
