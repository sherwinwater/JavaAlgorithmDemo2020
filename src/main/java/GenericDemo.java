import java.util.Arrays;
import java.util.List;

public class GenericDemo<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    /**
     * To declare a bounded type parameter, list the type parameter's name,
     * followed by the extends keyword, followed by its upper bound,
     * which in this example is Number. Note that, in this context,
     * extends is used in a general sense to mean either "extends" (as in classes)
     * or "implements" (as in interfaces).
     * @param u
     * @param <U>
     */
    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName() + " " + t);
        System.out.println("U: " + u.getClass().getName() + " " + u);
    }

    public static void main(String[] args) {
        GenericDemo<Integer> integerBox = new GenericDemo<>();
        integerBox.set(new Integer(10));
        integerBox.inspect(4);
//        integerBox.inspect("some text"); // error: this is still String!

        GenericDemo<String > stringBox = new GenericDemo<>();
        stringBox.set("this is string");
        System.out.println(stringBox.get().getClass().getName());

        System.out.println("----------unbounded wildcards------------");
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);

        System.out.println("---------upper bounded wildcards------------");
        List<Integer> li2 = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li2));
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));

        System.out.println("---------lower bounded wildcards------------");
        List<Integer> liint = Arrays.asList(2,5,7);
        List<Number> linumber = Arrays.asList(2.4,5,7);
        addNumbers(liint);
        System.out.println();
        addNumbers(linumber);
        System.out.println();
        List<Object> liobject = Arrays.asList("a","b");
        addNumbers(liobject);

    }
    // wildcards  ? The unbounded wildcard type is specified using the wildcard
    // character (?), for example, List<?>. This is called a list of unknown type.
    // There are two scenarios where an unbounded wildcard is a useful approach:
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }

    //upper bounded wildcards
    // To write the method that works on lists of Number and the subtypes of Number,
    // such as Integer, Double, and Float, you would specify List<? extends Number>.
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    //lower bounded wildcards
    // To write the method that works on lists of Integer and the supertypes of Integer,
    // such as Integer, Number, and Object, you would specify List<? super Integer>. T
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
