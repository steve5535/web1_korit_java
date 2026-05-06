package _23_Collction;

import lombok.Data;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        // Key - Value 형태로 데이터를 저장함
        Map<String, Integer> stMap = new HashMap<>();

        // 추가
        stMap.put("김자바", 90);
        stMap.put("이파이썬", 85);
        stMap.put("박스프링", 92);

        // 조회
        Integer num = stMap.get("김자바"); // 90
        System.out.println(num);

        // 업데이트
        // key를 중복하면, 덮어써짐
        stMap.put("김자바", 100); // 90 -> 100

        // 삭제
        stMap.remove("박스프링"); // key를 지정
        stMap.remove("어쩌고저쩌고"); // 없는 key를 지정해도 에러가 발생 안한다

        // 불면Map -> 생성이후 조회만
        Map<String, Integer> stMap2 = Map.of(
                "김아무개", 90,
                "박아무개", 80,
                "이아무개", 85
        );

        System.out.println(stMap2);
        // Map안에 Map 가능
        /*
            {
                "김아무개" : 90,
                "박아무개" : 80,
                "이아무개" : 85
            }

            {
                "홍길동" : {
                    "주소" : "부산",
                    "취미" : "독서"
                },
                "김길동" : {
                    "주소" : "대구",
                    "취미" : "게임"
            }

         */

        // Map<String, Map<String, String>> sample;

        // Map for문 순회하는 방법
        // 1. key들만 데이터로 뽑아오는 방법
        Set<String> keys = stMap.keySet();

        for(String key : keys) {
            Integer value = stMap.get(key);
            System.out.println(key + ": " + value);
        }

        // 2. 엔트리 방법으로 한번에 뽑아오기 - 참고
        Set<Map.Entry<String, Integer>> entries = stMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        @Data
        class Student {
            private final String name;
            private final int grade;
            private final int kor;
            private final int eng;
            private final int math;
        }

        List<Student> allSt = List.of(
                new Student("김하나", 1, 90, 80, 70),
                new Student("김둘", 1, 70, 60, 100),
                new Student("김셋", 2, 80, 70, 40),
                new Student("김넷", 2, 50, 80, 100)
        );

        Map<Integer, List<Student>> gradeMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );
        System.out.println(gradeMap);


        for (Student st : allSt) {
            Integer grade = st.getGrade(); // 학년
            List<Student> stList = gradeMap.get(grade); // 리스트
            stList.add(st); // 해당 리스트에 추가
        }

        System.out.println(gradeMap);

        /*
            {
                1 : [김하나 객체, 김둘 객체],
                2 : [김셋 객체, 김넷 객체]
            }
            allSt에서 1학년은 key가 1인 리스트에 추가
            2학년은 key가 2인 리스트에 추가
         */

    }
}
