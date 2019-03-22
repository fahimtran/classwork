// This application displays some math facts
public class FixDebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }
   public static void add(int x, int y)
   {
      System.out.println("The sum of " + x +
         " and " + y + " is " + (x + y));
   }
   public static void subtract(int x, int y)
   {
      System.out.println("The difference between " +
        x + " and " + y + " is " + (x - y));
   }
}
