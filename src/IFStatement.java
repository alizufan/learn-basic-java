public class IFStatement {
  public static void main(String[] args) {
    // # IF Statement
    //   - 'If' is one of the keywords used for branching.
    //   - Branching means that we can execute certain program code when a condition is met.
    //   - Almost all programming languages support if expressions.
    //
    // # Example:

    var a = 70;
    var b = 90;

    if (a >= 75 && b >= 75) {
      System.out.println("You Pass!");
    }

    // # Else Statement
    //   - The if block will be executed when the if condition evaluates to true.
    //   - Sometimes we want to execute certain programs if the condition is false.
    //   - This can be done using an else expression.
    //
    // # Example:

    if (a >= 75 && b >= 75) {
      System.out.println("You Pass!");
    } else {
      System.out.println("You Not Pass!");
    }

    // # Else If Statement
    //  - Sometimes in if, we need to create several conditions.
    //  - In cases like this, in Java we can use the Else If expression.
    //  - There can be more than one else if in Java.
    //
    // # Example:

    if (a >= 80 && b >= 80) {
      System.out.println("Your Score A!");
    } else if (a >= 70 && b >= 70) {
      System.out.println("Your Score B!");
    } else if (a >= 60 && b >= 60) {
      System.out.println("Your Score C!");
    } else if (a >= 50 && b >= 50) {
      System.out.println("Your Score D!");
    } else {
      System.out.println("Your Score E!");
    }
  }
}
