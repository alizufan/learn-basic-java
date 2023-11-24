public class BreakContinueKeyword {
  public static void main(String[] args) {
    // # Break & Continue Keyword
    //  - In the switch statement, we already know the break keyword,
    //    which is to stop the case in the switch.
    //  - As with loops, break is also used to stop the entire loop.
    //  - However, it is different from continue, continue is used to stop the current loop,
    //    then continue to the next loop.
    //
    // # Example:
    var c = 1;
    while (true) {
      System.out.println("Loop Number - "+ c);
      c++;

      if(c > 10) {
        break;
      }
    }
    System.out.println("Loop Stopped");

    System.out.println();

    for (var i = 1;i <= 100;i++) {
      // Remove Even Number
      if (i % 2 == 0) {
        continue;
      }

      System.out.println("Odd Number - "+ i);
    }
  }
}
