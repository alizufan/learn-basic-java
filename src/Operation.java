public class Operation {
  public static void main(String[] args) {
    // # Operation
    //   - (+): addition
    //   - (-): subtraction
    //   - (*): multiplication
    //   - (/): division
    //   - (%): remainder division (modulo)

    System.out.println("# Math Operation");
    int a = 100;
    int b = 10;
    int c = 9;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % c);

    System.out.println();
    // # Augmented Assignment
    //  - Some an operation to modify variable itself.
    //   - Operation Math | Augmented Assignment
    //   - (a = a + 10)   | a += 10
    //   - (a = a - 10)   | a -= 10
    //   - (a = a * 10)   | a *= 10
    //   - (a = a / 10)   | a /= 10
    //   - (a = a % 10)   | a %= 10

    System.out.println("# Augmented Assignment");
    int d = 10;

    d += 10;
    System.out.println(d);

    d -= 10;
    System.out.println(d);

    d *= 10;
    System.out.println(d);

    d /= 10;
    System.out.println(d);

    d %= 10;
    System.out.println(d);

    System.out.println();
    // # Unary Operator
    //   Operation | Description
    //   ++        | a = a + 1
    //   --        | a = a - 1
    //   -         | Negative
    //   +         | Positive
    //   !         | Not (boolean inverse)
    System.out.println("# Unary Operator");

    int e = +100;
    int f = -10;

    // ++e / e++ | --e / e--
    e++;
    System.out.println(e);
    e--;
    System.out.println(e);

    // ++f / f++ | --f / f--
    f++;
    System.out.println(f);
    f--;
    System.out.println(f);

    boolean g = true;
    System.out.println(!g);

    System.out.println();
    // # Comparison Operator
    //   Operation | Description
    //   >         | Grather Than
    //   <         | Less Than
    //   >=        | Grather Than Equal
    //   <=        | Less Than Equal
    //   ==        | Equal
    //   !=        | Not Equal
    //
    // # Example:
    System.out.println("# Comparison Operator");

    int val1 = 100;
    int val2 = 100;

    System.out.println(val1 > val2);
    System.out.println(val1 < val2);
    System.out.println(val1 >= val2);
    System.out.println(val1 <= val2);
    System.out.println(val1 == val2);
    System.out.println(val1 != val2);

    System.out.println();
    // # Boolean Operator
    //   Operation | Description
    //   &&        | And
    //   ||        | Or
    //   !         | Not
    //
    // # Table '&&':
    //  | Value 1 | Operation | Value 2 | Result
    //  -----------------------------------------
    //  | true    | &&        | true    | true
    //  | true    | &&        | false   | false
    //  | false   | &&        | true    | false
    //  | false   | &&        | false   | false
    //
    // # Table '||':
    //  | Value 1 | Operation | Value 2 | Result
    //  -----------------------------------------
    //  | true    | ||        | true    | true
    //  | true    | ||        | false   | true
    //  | false   | ||        | true    | true
    //  | false   | ||        | false   | false
    //
    // # Table '!':
    //  | Operation | Value 2 | Result
    //  -------------------------------
    //  | !        | true     | false
    //  | !        | false    | true
    System.out.println("# Boolean Operator");

    var absentee = 70;
    var score = 80;

    var passAbsentee = absentee >= 75;
    var passScore = score >= 75;

    var passed = passAbsentee && passScore;
    System.out.println(passed);
  }
}
