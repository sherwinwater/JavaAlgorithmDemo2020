import java.util.ArrayList;
import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {

        ArrayList<String> book11 = new ArrayList<>();
        System.out.println("book is " + book11);
        System.out.println("book is empty " + book11.isEmpty());
        System.out.println("book is null" + book11 == null);
        book11.clear();
        System.out.println("after book.clear, book is " + book11);
        System.out.println("book is null" + book11 == null);
        book11 = null;
        System.out.println("book is " + book11);
        System.out.println("book is null" + book11 == null);
        
        String s ="";
        String s1= null;
        String s2= new String();  // same with s, ""
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        ArrayList<String> book = new ArrayList<>();
        ArrayList<String> cards = new ArrayList<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        cards.add("A");
        cards.add("B");
        cards.add("C");
        cards.add("A");
        cards.add("B");
        cards.add("B");
        cards.add("C");
        cards.add("B");

        for (int j = 0; j < cards.size(); j++) {
            String key = cards.get(j);
            if (!map1.containsKey(key)) {
                map1.put(key, 1);
                map2.put(j, key);
            } else {
                System.out.println("map1" + map1);
                map1.put(key, map1.get(key) + 1);
                System.out.println("map1" + map1);

                map2.put(j, key);
            }
        }
        System.out.println("map1" + map1);
        System.out.println("map2" + map2);

        map1.forEach((k1, v1) -> {
            if (v1 == 4) {
                map2.forEach((k2, v2) -> {
                    if (k1.equals(v2)) {
                        book.add(cards.get(k2));
                        System.out.println("k " + k2);
                    }
                });
            }
        });
        System.out.println("book is " + book);
    }

}
