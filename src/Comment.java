public class Comment {
  public static void main(String[] args) {
    // # Comment
    //  - Sometimes when creating programs, we often place comments in the program code.
    //  - Comments are program code that will be ignored during the compilation process,
    //    so that in Java binary code, there will be no comment code.
    //  - Usually comments are used for documentation.
    //
    // # Example:
    System.out.println("Sum Result: " + sum(73, 17));
  }

  /**
   * Calculate The Sum a + b
   *
   * @param a value a
   * @param b value b
   *
   * @return a + b
   *
   */
  static int sum(int a, int b) {
    return a + b;
  }
}
