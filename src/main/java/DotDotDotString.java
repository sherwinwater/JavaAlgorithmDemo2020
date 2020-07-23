public class DotDotDotString {

    public static void main(String[] args) {
        getNumbers(1,2,3,4);
        getString("a","b","c");
    }

    public static void getNumbers(int... numbers){

        for(int num:numbers)
            System.out.println(num);
    }

    public static void getString(String... args){

        for(String string:args)
            System.out.println(string);
    }

}
