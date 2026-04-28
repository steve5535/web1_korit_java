package _16_Interface.a;

public class Square implements Shape{

    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.width * this.height;
        return area;
    }
}
