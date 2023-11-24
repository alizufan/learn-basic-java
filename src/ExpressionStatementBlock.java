import java.util.Date;

public class ExpressionStatementBlock {
  public static void main(String[] args) {
    // # Expression
    //   - Is a construction of variables, operators and method calls that evaluate to a single value.
    //   - Is core component of the statement.
    //
    // # Example:
    int val;
    val = 5;

    // # Statement
    //   - A statement can be said to be a complete sentence in the language.
    //   - Contains complete, usually ends with a semicolon.
    //   - There are several types of statements:
    //      + Assignment Expression
    //      + Use of ++ and --
    //      + Invocation method
    //      + Object Creation Expression
    //
    // # Example:

    // You can call it expression or statement
    int val2;
    val2 = 10;

    // You can call it statement
    //  - System.out.println is expression
    //  - val2 = 100 is expression
    //  - expression(expression) = statement
    //
    // But if you read from start until end (;) that is statement
    System.out.println(val2 = 100);

    // # Specific Statement
    // Example:

    // This is 'Assignment Statement'
    double aVal = 8933.234;

    // This is 'Increment Statement'
    aVal++;

    // This is 'Method Invocation Statement'
    System.out.println("Hello Buddy!");

    // This is 'Object Creation Statement'
    Date date = new Date();

    // # Block
    //   - To group a codes

    System.out.println("A");
    System.out.println("B");
    System.out.println("C");

    {
      System.out.println("D");
      {
        System.out.println("E");
        System.out.println("F");
      }
    }
  }
}
