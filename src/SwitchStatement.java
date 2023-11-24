public class SwitchStatement {
  public static void main(String[] args) {
    //  # Switch Statement
    //    - sometimes we just need to use simple conditions in if statements such as just using the equals' ratio.
    //    - Switch is a branching statement that is the same as if, but it is simpler to create.
    //    - The condition in the switch statement is only for equal to comparison.
    //
    //  # Example:

    var score = "D";

    switch (score) {
      case "A":
        System.out.println("Amazing!");
        break;
      case "B":
        System.out.println("Great!");
        break;
      case "C":
      case "D", "E":
        System.out.println("Keep it up!");
        break;
      case "F":
        System.out.println("Learning Go Go Go!");
        break;
      default:
        System.out.println("You Can Do it!");
    }

    // # Switch Lambda
    //   - in java version 14, switch expressions with lambda were introduced.
    //   - This makes it easier to use switch expressions because we no longer need to use the break keyword.
    //
    //  # Example:

    var scoreX = "B";

    switch (scoreX) {
      case "A" -> {
        System.out.println("Too Amazing!");
      }
      case "B" -> System.out.println("Great!");
      case "C", "D", "E" -> System.out.println("Keep it up!");
      case "F" -> System.out.println("Learning Go Go Go!");
      default -> {
        System.out.println("You Can Do it!");
      }
    }

    // # 'Yield' Keyword
    //  - in Java 14, there is a new keyword, namely yield,
    //    where we use the yield keyword to return the value on the statement switch.
    //  - This makes it very easy for us when we need to create data based on switch statement conditions.
    //
    // # Example:

    // # Example without yield:
    //   - To many redundant code
    var scoreY = "G";

    String str;
    switch (scoreY) {
      case "A" -> str = "Too Amazing!";
      case "B" -> str = "Great!";
      case "C", "D", "E" -> str = "Keep it up!";
      case "F" -> str = "Learning Go Go Go!";
      default -> {
        str = "You Can Do it!";
      }
    }

    System.out.println(str);


    // # Example without yield:
    String scoreZ = "F";

    String val = switch (scoreZ) {
      case "A":
        yield "Too Amazing!";
      case "B" :
        yield "Great!";
      case "C", "D", "E":
        yield "Keep it up!";
      case "F":
        yield "Learning Go Go Go!";
      default:
        yield "You Can Do it!";
    };

    System.out.println(val);
  }
}
