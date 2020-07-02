public class DemoAbstract {

    public static void main(String[] args) {
        Number[] n = new Integer[2];
//    n[0] = new Double(1.5);
//    n[0] = 1.5;  // integer
        n[0] = 2;

        Number x = 3;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());
//        System.out.println((Integer)x.compareTo(new Integer(4))); 
//The program has a syntax error because the member access operator (.) is executed before the casting operator.

//        System.out.println((x.compareTo(new Integer(4))); 
//The program has a syntax error because x does not have the compareTo method.

//        System.out.println((Integer)x.compareTo(4));
//        System.out.println(x.compareTo(4));
        System.out.println(new Integer(2).compareTo(new Integer(4)));
        System.out.println(new Integer(2).compareTo(4));
        System.out.println(new Integer(2).compareTo(4));

        System.out.println(n[0]);

    }
}
