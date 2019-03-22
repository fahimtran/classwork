import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        Consumer<String> stringConsumer = System.out::println;
        // just print every element
        list1.forEach(stringConsumer);

        System.out.println(); // spacing

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(7);

        // System.out::println is taken as an implementation of Consumer<Integer>
        list2.forEach(System.out::println); // just print every element

        /*
        list2.forEach(stringConsumer);
        
        that line of code doesn't compile because stringConsumer is a consumer that accepts Strings,
        however list2 contains Integers and the list2.forEach method expects a Consumer that accepts
        Integers; although the implementations of both consumers are essentially the same the compiler
        cannot make this assumption and stays on the safe side to let you know that it's expecting one
        thing but getting a potentially completely different one
        */
    }
}