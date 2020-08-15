package generic;

public class GenericMethodDemo {

    public static void main(String[] args) {
        Integer[] integers ={1,3,4};
        String[] strings ={"a","b","c"};

        GenericMethodDemo.print(integers);
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.print(strings);
        GenericMethodDemo.<String>print(strings);
    }

    public static <E> void print(E[] list){
//    public static void print(E[] list){
        for(int i =0; i<list.length; i++)
            System.out.println(list[i]+" ");
        System.out.println();
    }
}
