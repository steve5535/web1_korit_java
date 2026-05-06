package _22_Generic;

// 타입매개변수
// 일반적으로 <T>, <E> 변수 사용
// <K, V>, <K, V, E>
public class Box<T> {
    // 해당 클래스에서는 가상의 타입T를 쓰겠다
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
