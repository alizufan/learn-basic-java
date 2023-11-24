public class TernaryOperator {
  public static void main(String[] args) {
    // # Ternary Operator
    //  - Simple operator of if statement
    //  - Consists of conditions that are evaluated, if it produces true then the first value is taken, if false the second value is taken.
    //
    // # Example:

    // # Example Without Ternary:
    var score = 75;
    String str;

    if (score >= 75) {
      str = "Great!";
    } else {
      str = "Try Again!";
    }

    System.out.println(str);

    // # Example With Ternary:
    str = score >= 75 ? "Great Ma Men!": "Try Again Ma Men!";

    System.out.println(str);
  }
}
