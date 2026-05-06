package _22_Generic;

// 데이터를 저장하는 클래스
public class ObjBox {
    private Object item;

    public ObjBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return this.item;
    }
}
