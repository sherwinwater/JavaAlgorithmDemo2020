package generic;

public class Rec extends GeometricObject {
    private int length;
    private int width;

    public Rec() {
    }

    public Rec(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width ;
    }
}
