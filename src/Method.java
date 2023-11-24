public class Method {
  public static void main(String[] args) {
    // # Method
    //  - A method is a block of program code that will run when we call it.
    //  - Previously we used the println() method to display text in the console.
    //  - To create a method in Java, we can use the void keyword, followed by the method name,
    //    brackets () and ending with block.
    //  - We can call methods by using the method name followed by brackets ().
    //  - In other programming languages, Method is also called Function.
    //
    // # Example:
    saySomething();

    System.out.println();
    // # Method Parameter
    //   - We can send information to the method we want to call.
    //   - To do this, we need to add parameters or arguments to the method that we have created.
    //   - How to create parameters is the same as how to create variables.
    //   - Parameters are placed in brackets () in the method declaration.
    //   - There can be more than one parameter, if there is more than one,
    //     they must be separated using commas.
    //
    // # Example:
    sayMyName("John Doe", 23);

    System.out.println();
    // # Method Return Value
    //   - By default, the method does not return any values, but if we want,
    //     we can make a method return a value.
    //   - So that the method can produce a value,
    //     we must change the void keyword to the resulting data type.
    //   - And in the block method, to produce this value, we must use the return keyword,
    //     then followed by data that matches the data type that we have declared in the method.
    //   - In Java, we can only produce 1 data in a method, not more than one.
    //
    // # Example:
    var a = 100;
    var b = 200;
    var c = sum(a, b);

    System.out.println("Total Sum: " + c);

    System.out.println();

    // # Method Variable Argument
    //   - Sometimes we need to send data to a method with an uncertain amount of data.
    //   - Usually, to do this, we will use Array as a parameter in the method.
    //   - However, in Java, we can use variable arguments,
    //     to send data that contains an uncertain amount, which can be zero or more.
    //   - Parameters with variable argument type can only be placed at the end of the parameter.
    //
    // # Example:

    int[] scores = {40,75,60,50,65,75,50,65};

    // Without:
    sayGradeWithoutMVA("John Doe", scores);

    // With:
    sayGradeWithMVA("Melisa Karina", 80,75,80,80,65,75,75,90);

    System.out.println();

    // # Method Overloading
    //  - Method overloading is the ability to create a method with the same name more than once.
    //  - However, there are conditions, namely that the parameter data in the method must be different,
    //    including the number or type of parameter data.
    //  - If there are the same, then our Java program will error.
    //
    // # Example:
    sayHi();
    sayHi("John");
    sayHi("John", "Doe");

    System.out.println();

    // # Recursive Method
    //   - Recursive method is the ability of a method to call its own method.
    //   - Sometimes there are many problems, which are easier to solve using recursive methods, such as the factorial case.
    //
    // # Problems With Recursive
    //   - Although recursive methods are very interesting, we need to be careful.
    //   - If the recursive is too deep, there is a possibility that a StackOverflow error will occur,
    //     namely an error where there are too many stack methods in Java.
    //   - Why does this problem occur? Because when we call a method, Java will store it in the stack,
    //     if the method calls another method, the stack will continue to pile up, and if it is too deep,
    //     the stack will be too big, and it can cause a StackOverflow error.
    //
    // # Example:
    System.out.println("Factorial Without Recursive: " + factorial(5));
    System.out.println("Factorial With Recursive: " + factorialRecursive(5));

    // Error Overflow Example:
    //  - Note: Every Computer Difference to get java.lang.StackOverflowError
    loopRecursiveOverflow(10000);
  }

  static void saySomething() {
    System.out.println("Hy Buddy!");
  }

  static void sayMyName(String name, Integer age) {
    System.out.println("My Name is " + name + ", My Age is " + age);
  }

  static int sum(int a, int b) {
   return a + b;
  }

  // Without Method Variable Argument
  static void sayGradeWithoutMVA(String name, int[] scores) {
    int total = 0;
    for (var score: scores) {
      total += score;
    }

    // average
    var avg = total / scores.length;
    if(avg >= 75) {
      System.out.println("You Are Pass:" + name + ", Final Score: "+ avg);
    } else {
      System.out.println("Sorry, You Are Not Pass:" + name + ", Final Score: "+ avg);
    }
  }


  // With Method Variable Argument
  static void sayGradeWithMVA(String name, int... scores) {
    int total = 0;
    for (var score: scores) {
      total += score;
    }

    // average
    var avg = total / scores.length;
    if(avg >= 75) {
      System.out.println("You Are Pass:" + name + ", Final Score: "+ avg);
    } else {
      System.out.println("Sorry, You Are Not Pass:" + name + ", Final Score: "+ avg);
    }
  }
  static void sayHi() {
    System.out.println("Hi !");
  }

  static void sayHi(String firstName) {
    System.out.printf("Hi %s !\n", firstName);
  }

  static void sayHi(String firstName, String lastName) {
    System.out.printf("Hi %s %s !\n", firstName, lastName);
  }

  static int factorial(int value) {
    var result = 1;
    for (int i = 1; i <= value; i++) {
      result *= i;
    }

    return result;
  }

  static int factorialRecursive(int value) {
    if(value == 1) {
      return value;
    }

    return value * factorialRecursive(value - 1 );
  }

  static void loopRecursiveOverflow(int value) {
    if (value == 0) {
      System.out.println("Done!");
      return;
    }

    System.out.printf("Loop - %d!\n", value);
    loopRecursiveOverflow(value - 1);
  }
}
