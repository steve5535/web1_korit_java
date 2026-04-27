package _14_Inheritance.shape;

public class ShapeMain {
    public static void printArea(Shape s) {
        double area = s.getArea(); // 오버라이딩된 메서드 호출
        // 여러가지 도형을 추가하더라도, 코드 변경 x
        System.out.println("면적: " + area);
    }

    public static void main(String[] args) {
        // Square - width, height, getArea() 오버라이딩
        // Triangle - width, height, getArea() 오버라이딩
        // 클래스를 작성해 주세요
        // main에서 실제 객체를 생성해 주세요
        Shape s1 = new Square(10, 10);
        Shape s2 = new Triangle(10, 10);

    }
}
