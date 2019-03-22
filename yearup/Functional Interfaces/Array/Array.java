import java.util.function.IntConsumer;

public class Array {
    private int[] data;

    // create the int array with the given size
    public Array(int size) {
        data = new int[size];
    }

    // set a value at a particular index
    public void set(int index, int value) {
        data[index] = value;
    }

    // get the size of this array
    public int size() {
        return data.length;
    }

    // iterates through every element in the "data" array
    public void forEach(IntConsumer ic) {
        for (int i = 0; i < data.length; i++) {
            // call the IntConsumer to operate upon the current element
            ic.accept(data[i]);
        }
    }
}