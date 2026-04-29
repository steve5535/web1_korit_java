package _17_Object;

class MyClass {

}

public class ObjectMain {
    public static void main(String[] args) {
        // Object: 최상위 부모 객체
        // Wrapper class(래퍼 클래스)
        Object a = 10; // 업캐스팅
        Object b = 3.14; // 업캐스팅
        int intVal = 10;
        double doubleVal = 10.5;
        Integer wrapper1 = intVal; // 컴파일러가 new를 호출
        Double wrapper2 = doubleVal;

        Object c = "안녕하세요"; // 업캐스팅
        Object d = new MyClass(); // 업캐스팅

        // -> Object 클래스에 정의된 메서드를 사용할 수 있음
        MyClass sample = new MyClass();
        // toString(), equals(), hashCode()

        ObjectStudent st = new ObjectStudent("홍길동", 20);
        String strSt = st.toString(); // 객체를 문자열로 변환
        System.out.println(strSt);
        System.out.println(st); // println이 내부적으로 toString()호출

        ObjectStudent stt = new ObjectStudent("홍길동", 20);
        System.out.println(st == stt); // 주소비교 -> false
        System.out.println(st.equals(stt));


    }
}
