package generic;

public class BoundedTypeDemo {
    public static void main(String[] args){
        Rec rec = new Rec(2,3);
        Circle circle = new Circle(1);
        System.out.println("rec area "+ rec.getArea());
        System.out.println("circle area "+circle.getArea());
        System.out.println("same area? "+
                equalArea(rec,circle));
        System.out.println("max is " +max(rec,circle).getClass().getName());

        System.out.println("compare "+equalArea2(rec,circle));
    }

    public static <E extends GeometricObject> boolean equalArea(
            E object1, E object2){
        return object1.getArea() == object2.getArea();
    }

    public static <E extends GeometricObject> E max(
            E object1, E object2){
        return object1.getArea() > object2.getArea()?object1:object2;
    }

    public static boolean equalArea2(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

}
