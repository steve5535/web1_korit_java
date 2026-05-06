package _22_Generic;

public class Main {
    public static void main(String[] args) {
        // String -> Object로 업캐스팅
        ObjBox box1 = new ObjBox("아이템입니다");
        // Integer -> Object로 업캐스팅
        ObjBox box2 = new ObjBox(1000);

        // 꺼낼땐 다운캐스팅이 필요하다
        // 실제 타입과 무관하게 컴파일러는 변수타입만 고려
        if (box1.getItem() instanceof String) {
            String myItem = (String) box1.getItem();
            System.out.println(myItem);
        } else if (box1.getItem() instanceof Integer) {
            Integer myItem = (Integer) box1.getItem();
            System.out.println(myItem);
        }
        // 다운캐스팅 때문에 instanceof로 작성하려니 코드가 너무 길어진다

        // 제너릭
        // 클래스 혹은 메서드에서 타입을 미리 정의하지 않는다
        // 사용할때 정의함
        Box<String> strBox = new Box<>("문자열");
        Box<Integer> intBox = new Box<>(10);

        // 제너릭 문법을 쓰면, 컴파일러가 알아서 다운캐스팅 코드작성
        // 저장을 유연하게 + 다운캐스팅 안전하게
        System.out.println(strBox.getItem());
        System.out.println(intBox.getItem());
        // 주의) 런타임때는 타입이 없어진다(타입소거)

    }
}
