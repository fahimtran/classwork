// remember that functional interfaces can only have one method
// if you attempt to make an interface that has multiple methods
// a functional interface, you'll get a compile error; there's no
// logical way of writing a lamda expression that has multiple
// methods, it'd be to complex and too many rules or assumptions
// would have to be made in this scenario
@FunctionalInterface
public interface Interface {
    // print an object
    void print(Object obj);
}