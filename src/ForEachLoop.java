public class ForEachLoop {
  public static void main(String[] args) {
    // # For Each
    //   - Sometimes we usually access array data using loops.
    //   - Accessing array data using loops is very long-winded, we have to create a counter, then access the array using the counter we created.
    //   - But fortunately, in Java there is a for each loop, which can be used to access all the data in an Array automatically.
    //
    // # Example:

    // # Without For Each
    String[] alphabets = {"A","B","C","D","E","F"};

    for (var i = 0; i < alphabets.length; i++) {
      System.out.println("Without For Each: Alphabet - " + alphabets[i]);
    }

    System.out.println();

    // # With For Each
    for (var alphabet: alphabets) {
      System.out.println("With For Each: Alphabet - " + alphabet);
    }
  }
}
