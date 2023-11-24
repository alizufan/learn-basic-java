import java.util.Arrays;

public class TypeDataArray {
  public static void main(String[] args) {
    // # Type Data Array
    //
    //   - Data type that contains a collection of data of the same type.
    //   - The amount of data in an array cannot change after it is first created.
    //
    // Example:

    System.out.println("# Type Data Array");
    String[] arrayString;
    arrayString = new String[2];
    arrayString[0] = "John";
    arrayString[1] = "Doe";

    System.out.println(arrayString[0]);
    System.out.println(arrayString[1]);

    // # Example Replaced Array Value:
    arrayString[1] = "Cena";
    System.out.println(arrayString[1]);

    System.out.println(Arrays.toString(arrayString));

    // using new type array
    int[] ints = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };

    // straight forward
    String[] names = {
            "John", "Doe", "February"
    };

    System.out.println();
    // # Operation In Array
    //
    //   - array[index]             : get a value in array.
    //   - array[index] = value     : modify a value in array.
    //   - array.length             : get a length of array.
    //
    // # Example:
    System.out.println("# Operation In Array");

    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names.length);

    System.out.println();
    // # Array in Array (2D Array)
    System.out.println("# Array in Array (2D Array)");

    String[][] members = {
            {"John", "Doe"},
            {"Ikhsan", "Nuhudin"},
            {"Charles", "Kuntoro"},
    };

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
    System.out.println(members[2][1]);
  }
}
