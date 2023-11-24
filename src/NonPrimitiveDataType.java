public class NonPrimitiveDataType {
  public static void main(String[] args) {
    // # Non-primitive Data Types (Object Data Type)
    //
    //   - Primitive data types are built-in types in programming languages.
    //     Primitive data types cannot be changed anymore.
    //
    //   - The data type number, char boolean is a primitive data type.
    //     Primitive data types always have default values.
    //
    //   - The String data type is not a primitive data type,
    //     non-primitive data types do not have a default value, and can be null.
    //
    //   - Non-primitive data types can have methods/functions.
    //   - In Java, all primitive data types have their non-primitive data type representation.
    //
    //  # Representation Data Type Primitive
    //      - byte
    //         - non-primitive: Byte
    //      - short
    //         - non-primitive: Short
    //      - int
    //         - non-primitive: Integer
    //      - long
    //         - non-primitive: Long
    //      - float
    //         - non-primitive: Float
    //      - double
    //         - non-primitive: Double
    //      - char
    //         - non-primitive: Character
    //      - boolean
    //         - non-primitive: Boolean
    //
    //  # Note
    //    - Non-Primitive data type is Nullable.
    //    - Non-Primitive data type must be initiated null or type of data itself.
    //    - Non-Primitive data type has default value 'null'.
    //
    // # Example:

    Byte byteNum = null;
    byteNum = 100;

    Short shortNum = 10000;
    Integer intNum = 1000000;
    Long longNum = 1000000000L;

    System.out.printf(
            "# Non-primitive Data Types\nByte Number: %d\nShort Number: %d\nInt Number: %d\nLong Number: %d\n\n",
            byteNum, shortNum, intNum, longNum
    );

    // # Conversion Data Type Non-Primitive
    //   - use a method '[int,short,long,float,double,etc.]Value' to convert a value.
    //
    // # Example:

    int intVal = 100;
    Integer intObject = intVal;

    short shortVal = intObject.shortValue();
    long longVal = intObject.longValue();
    float floatVal = intObject.floatValue();

    System.out.printf(
            "# Conversion Data Type Non-Primitive\nFrom Int Number: %d, To:\nShort Number: %d\nLong Number: %d\nFloat Number: %f\n\n",
            intVal, shortVal, longVal, floatVal
    );
  }
}
