import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();

        makeList1(lst1, 1000000);
        makeList1(lst2, 1000000);

        makeList2(lst1, 100000);
        makeList2(lst2, 100000);
        
//        System.out.println("ArrayList: " + makeList1(lst1, 1000000));
//        System.out.println("LinkedList: " + makeList1(lst2, 1000000));
//        System.out.println("ArrayList: " + makeList2(lst1, 100000));
//        System.out.println("LinkedList: " + makeList2(lst2, 100000));

    }

    public static List<Integer> makeList1(List<Integer> lst, int N) {
        lst.clear();
        int n = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            lst.add(i);
            n++;
        }
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / (long) Math.pow(10, 6);
        System.out.println("running time is " + totalTime);
        return lst;
    }

    public static List<Integer> makeList2(List<Integer> lst, int N) {
        lst.clear();
        int n = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            lst.add(0, i);
            n++;
        }
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / (long) Math.pow(10, 6);
        System.out.println("running time is " + totalTime);

        return lst;
    }
}
