import java.util.Optional;

/**
 * The main issue this class is intended to tackle is
 * the infamous NullPointerException
 * Essentially, this is a wrapper class that contains an optional value,
 * meaning it can either contain an object or it can simply be empty.
 */


public class OptionalDemo{
    public static void main(String[] args) {
        String[] words = new String[10];
        for(int i =0; i <words.length; i++){
            words[i]="a"+i;
        }
        Optional<String> checkNull =
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");


        //Solution: Using Optional Class
        String[] str = new String[10];
        Optional<String> isNull = Optional.ofNullable(str[9]);
        if(isNull.isPresent()){
            //Getting the substring
            String str2 = str[9].substring(2, 5);
            //Displaying substring
            System.out.print("Substring is: "+ str2);
        }
        else{
            System.out.println("Cannot get the substring from an empty string");
        }
        str[9] = "AgraIsCool";
        Optional<String> isNull2 = Optional.ofNullable(str[9]);
        if(isNull2.isPresent()){
            //Getting the substring
            String str2 = str[9].substring(2, 5);
            //Displaying substring
            System.out.println("Substring is: "+ str2);
        }
        else{
            System.out.println("Cannot get the substring from an empty string");
        }

        //Example: Optional isPresent() vs ifPresent() methods
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();
        /* isPresent() method: Checks whether the given Optional
         * Object is empty or not.
         */
        if (GOT.isPresent()) {
            System.out.println(GOT.get());
        }
        else {
            System.out.println("I am getting Bored");
        }
        /* ifPresent() method: It executes only if the given Optional
         * object is non-empty.
         */
        //This will print as the GOT is non-empty
        GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));
        //This will not print as the nothing is empty
        nothing.ifPresent(s -> System.out.println("I prefer getting bored"));

        //Java 8 – Optional orElse() and orElseGet() methods
        //Creating Optional object from a String
        GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
         nothing = Optional.empty();

        //orElse() method
        System.out.println(GOT.orElse("Default Value"));
        System.out.println(nothing.orElse("Default Value"));

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value"));
        System.out.println(nothing.orElseGet(() -> "Default Value"));

        //Java 8 – Optional.map and Optional.flatMap
        //Creating Optional object from a String
        GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        nothing = Optional.empty();
        System.out.println(GOT.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));
        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));
        System.out.println("Value of Optional object"+anotherOptional);
        System.out.println("Optional.map: "
                +anotherOptional.map(gender -> gender.map(String::toUpperCase)));
        //Optional<Optional<String>>    -> flatMap -> Optional<String>
        System.out.println("Optional.flatMap: "
                +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
    }
}