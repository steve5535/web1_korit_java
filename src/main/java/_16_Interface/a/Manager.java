package _16_Interface.a;

public class Manager {
    public double calcPrice(Shape shape) {
        double area = shape.getArea();
        double price = area * 100;
        return price;
    }
}
