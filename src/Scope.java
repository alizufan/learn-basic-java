public class Scope {
  public static void main(String[] args) {
    // # Scope
    //  - In Java, variables can only be accessed within the area where they were created,
    //    this is called scope.
    //  - For example, if a variable is created in a method, it can only be accessed in that method,
    //    or if it is created in a block, then it can only be accessed in that block.
    //
    // # Example:
    sayName("John Doe");
  }

  static void sayName(String name) {
    String hello = "Hello " + name;
    if(!name.isBlank()) {
      // hi only in this scope
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
    // var hi is not in scope function sayName,
    // it can cause an error if you call use it
    // System.out.println(hi);
  }
}
