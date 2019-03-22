// does the same thing as Main.java, but instead we don't need
// import java.util.function.IntConsumer because of the shorthand method
// we use
public class MainTwo {
    public static void main(String[] args) {
        Array array = new Array(100);

        // set 0 through (array.size() - 1) in the array
        for (int i = 0; i < array.size(); i++) {
            array.set(i, i);
        }

        // print the square root of every element in the array
        array.forEach(value -> System.out.println(Math.sqrt(value)));
        // because the forEach method expects an IntConsumer, our lamda is
        // assumed to be an IntConsumer; you can do this for any method
        // that requires a functional interface in its parameters
    }
}