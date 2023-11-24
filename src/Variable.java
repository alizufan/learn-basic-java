public class Variable {
  public static void main(String[] args) {
    // # Variable
    //
    //   - A place to save a data / value.
    //   - Java is static type language, so a variable can only be used to store the same data type,
    //     cannot change data types like the PHP / Javascript programming language.
    //   - To create a variable in Java we can use the data type name followed by the variable name.
    //   - Variable names cannot contain whitespace (space, enter, tab), and cannot be all numbers.
    //
    // # Example:
    System.out.println("# Basic Variable");

    // not yet initiated by data.
    String name;
    name = "John Doe";

    // has been initiated by data.
    int age = 30;
    String address = "Kediri, East Java, Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

    // change a value from name
    name = "Melisa Mei";
    System.out.println(name);

    System.out.println();

    // # Var Keyword
    //
    //   - Since Java 10, Java supports creating variables with the var keyword,
    //     so we don't need to mention the data type
    //   - However, remember! when we use the var keyword to create a variable,
    //     we must initialize the value of the variable directly.
    //
    // # Example:
    System.out.println("# 'var' Keyword Variable");

    // error example:
    // var nameVar;
    // name = "John Doe";

    var nameVar = "John Doe";
    var ageVar = 30;
    var addressVar = "Kediri, East Java, Indonesia";

    System.out.println(nameVar);
    System.out.println(ageVar);
    System.out.println(addressVar);

    System.out.println();

    // # final Keyword
    //
    //   - By default, variables in Java can change their values.
    //   - If we want to create a variable whose data cannot be changed after it is first created,
    //     we can use the final keyword.
    //   - Many people also call the term variable like this constant.
    //
    // # Example:
    System.out.println("# 'final' Keyword Variable");

    final var nameFinal = "John Doe";
    final var ageFinal = 30;
    final var addressFinal = "Kediri, East Java, Indonesia";

    // # Error Example:
    //   - a final variable cannot be modified.

    // nameFinal = "Melisa Mei";
    // ageFinal = 40;
    // addressFinal = "Bandung, West Java, Indonesia";

    System.out.println(nameFinal);
    System.out.println(ageFinal);
    System.out.println(addressFinal);

    System.out.println();
  }
}
