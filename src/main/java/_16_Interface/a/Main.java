package _16_Interface.a;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(10, 20);
        Shape s2 = new Triangle(20, 30);
        Manager manager = new Manager();

        Shape[] shapes = {s1, s2};
        double totalPrice = 0.0;
        for (Shape s : shapes) {
            totalPrice += manager.calcPrice(s);
        }
        System.out.println("주문가격 총합: " + totalPrice);

    }
}
