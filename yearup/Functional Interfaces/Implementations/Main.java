public class Main {
    public static void main(String[] args) {
        final String object = "test";

        Interface oldWay = new Implemented();
        oldWay.print(object);

        System.out.println(); // some spacing

        // any functional interface can be written like this
        // inside the parentheses "(obj)" contains the parameters
        // for the method that the functional interface has;
        // unlike writing normal methods, in lamda expressions we don't
        // have to define the type of "obj" (or whatever your parameter
        // name is) because the functional interface's method signature
        // already has that covered; our lamda expression draws this
        // information in and assumes that "obj" will be of type "Object";
        // similarly if our print method took in a String, then "obj"
        // would be assumed to be of type "String"
        Interface newWay = (obj) -> {
            System.out.println(obj);
        };
        newWay.print(object);

        System.out.println();

        // this format can only be used when the functional interface's method
        // only has one parameter; if you have multiple parameters, then you either
        // use the first, fourth, or fifth format where best applicable
        // the second format just removes the parentheses
        Interface newWayTwo = obj -> {
            System.out.println(obj);
        };
        newWayTwo.print(object);

        System.out.println();

        // this format can only be used when your implementation of the method
        // is only one statement; only works with single parameter methods because
        // of the no parentheses thing
        Interface newWayThree = obj -> System.out.println(obj);
        newWayThree.print(object);

        System.out.println();

        // similar to the third format, but works with multiple parameter methods
        // because of the parentheses
        Interface newWayFour = (obj) -> System.out.println(obj);
        newWayFour.print(object);

        System.out.println();

        // this fromat can be used regardless of the number of parameters the method
        // takes, however it requires that your implementation make a single call to
        // another method; this method can be a static method belonging to a class OR
        // a method belonging to an object; this requires that the number of parameters
        // and their types in the functional interface's method match the method that
        // you will call
        Interface newWayFive = System.out::println;
        newWayFive.print(object);
        // here's a good template for this format
        /*
        @FunctionalInterface
        public interface InterfaceName {
            return_type methodName(Type1 one, Type2 two, ... TypeN n);
        }

        // this is the lamda expression
        InterfaceName variableName = identifier::methodName2;

        =========================================================================================

        ** return_type refers to whatever the return type will be for that functional interface
                       method
        ** methodName refers to the method name of that functional interface
        ** Type1, Type2 ... TypeN refers to the parameter types of the interface's methods
        ** identifier refers to the class name (in which case the method being called is static)
                      or to the object (in which case the method being called belongs to the object)
        ** methodName2 refers to the method name that is called from "identifier"; it must also
                       be applicable to the parameters and their types in "methodName", so it must
                       accept (Type1 one, Type2 two, ... TypeN n)
        */

        System.out.println();

        // InterfaceTwo implementations

        // makes use of a return statement for methods that have non-void return types
        InterfaceTwo newWaySix = (a, b) -> {
            return a + b;
        };
        System.out.println(newWaySix.add(1, 2));

        System.out.println();

        // instead of using a return statement and the fact that our operation is only
        // one statement, we can just ignore the braces and the return statement and use
        // "a + b" as our return statement
        InterfaceTwo newWaySeven = (a, b) -> a + b;
        System.out.println(newWaySeven.add(1, 2));

        System.out.println();

        // we can make our lamda expression even shorter by utilizing other methods
        // (like in the fifth format); here we utilize Math.addExact which takes in
        // two ints and returns an int: this is exactly what we need
        InterfaceTwo newWayEight = Math::addExact;
        System.out.println(newWayEight.add(1, 2));
        // Math.addExact adds two ints together but does so "safely"; ints have a maximum
        // value, 2^32 - 1 to be exact; because there's a maximum (and minimum) value for ints
        // they can overflow into weird values if you attempt to add Integer.MAX_VALUE with
        // itself for example. obviously it'd just be (2^32 - 1) * 2 but we have a limit and
        // the values start to overflow into smaller values in order to handle these large values
        // Math.addExact prevents this from happening by throwing an exception when the two numbers
        // being added overflow or do not add properly.
    }
}