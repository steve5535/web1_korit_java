package _22_Generic;

public class WildCard {

    // 와일드카드 문법 - 주로 메서드 or 리턴타입에 사용
    // 어떤 타입이 오던지 허용하겠다.
    // 다양한 타입에 대해 동일한 시그니처로 대응하겠다.
    // Box<T>는 생성할때 유동적으로 타입지정
    // Box<?>는 이미 생성되어 있는 제너릭타입들을 모두 대응
    public static void printBox(Box<?> box) {
        System.out.println(box.getItem()); // 허용
        // box.setItem("문자열"); 쓰기는 막혀있음

        // 다운캐스팅 불가능
        Object myItem = box.getItem();
    }
}
