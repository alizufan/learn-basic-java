public class DoWhileLoop {
  public static void main(String[] args) {
    // # Do While Loop:
    //  - Do While loop is a repetition similar to while.
    //  - The only difference is in checking the condition.
    //  - Checking the condition in the while loop is done at the beginning before the loop is carried out,
    //    whereas in the do while loop it is done after the loop is done.
    //  - Therefore, in a do while loop, at least one repetition is certain even if
    //    the condition does not evaluate to true.
    //
    // # Example:
    var c = 1;
    do {
      System.out.println("Loop Number - "+ c);
      c++;
    } while (c <= 10);
  }
}
