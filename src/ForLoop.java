public class ForLoop {
  public static void main(String[] args) {
    // # For Loop
    //  - For is a keyword that can be used to loop.
    //  - The code block contained in the for will always be repeated as long as the for condition is met.
    //
    // # Detail:
    //   Format: for(init statement; condition; post statement){ // loop block }
    //
    //  - The init statement will be executed only once at the beginning before the loop.
    //  - Conditions will be checked in each loop, if true the loop will be executed, if false the loop will stop.
    //  - The post statement will be executed every time at the end of the loop.
    //  - Init statement, Condition and Post Statement are not required to be filled in, if the Condition is not filled in, it means the condition always evaluates to true.
    //
    // # Example:

    // # Endless Loop (Un-comment to test out)
    // Note: Be careful in using looping endlessly will cause deadlock.
    //    for(;;){
    //      System.out.println("Endless Loop!");
    //    }

    // # Looping with conditions
    // counter
    var c = 1;
    for (;c <= 10;) {
      System.out.println("Conditions: Loop Number - "+ c);
      c++;
    }

    System.out.println();

    // # Looping with init statement
    for (var i = 1;i <= 10;) {
      System.out.println("Init Statement: Loop Number - "+ i);
      i++;
    }

    System.out.println();

    // # Looping with post statement
    for (var i = 1;i <= 10;i++) {
      System.out.println("Post Statement: Loop Number - "+ i);
    }
  }
}
