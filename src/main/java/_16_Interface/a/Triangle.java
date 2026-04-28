package _16_Interface.a;

public class Triangle implements Shape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.width * this.height * 0.5;
        return area;
    }
}
