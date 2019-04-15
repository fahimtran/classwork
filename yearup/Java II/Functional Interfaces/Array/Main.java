import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(100);

        // set 0 through (array.size() - 1) in the array
        for (int i = 0; i < array.size(); i++) {
            array.set(i, i);
        }

        // print out the square root (double) of the value passed in
        IntConsumer ic = value -> {
            System.out.println(Math.sqrt(value));
        };

        // print the square root of every element in the array
        array.forEach(ic);
    }
}