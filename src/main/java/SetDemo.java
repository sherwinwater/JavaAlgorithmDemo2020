import java.util.*;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();

        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");
        setA.add("123");

        Iterator<String> iterator = setA.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        for(String str : setA) {
            System.out.println(str);
        }

        Stream<String> stream = setA.stream();
        stream.forEach((element) -> { System.out.println(element); });

        boolean isEmpty = (setA.size() == 0);
        System.out.println("isEmpty "+isEmpty);

        boolean contains123 = setA.contains("123");
        System.out.println("123? "+contains123);

        List<String> list = new ArrayList<>();
        list.addAll(setA);
        System.out.println("list "+list.toString());

    }
}
