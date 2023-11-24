public class ConversionTypeDataNumber {
  public static void main(String[] args) {
    // # Conversion Type Data Number
    //
    //  - Widening Casting (Automatic by Java) :
    //      - Rules : From Small Size to Large Size
    //          + byte -> short -> int -> long -> float -> double
    //      - Why : Because when we move small numbers to large sizes,
    //              there will be no problems with large numbers and still can handle it.
    //
    //  - Narrowing Casting (Manual) :
    //      - Rules: From Large Size to Small Size, must be manual.
    //          + double -> float -> long -> int -> char -> short -> byte
    //      - Why : Because when we move large numbers to small sizes,
    //              there will be problems with small numbers and make it number overflow.
    // # Example:

    byte byteNum = 10;
    short shortNum = byteNum;
    int intNum = shortNum;

    byte byteNumNarrow = (byte) intNum;
    System.out.printf(
            "# Conversion Type Data Number\nByte Number: %d\nShort Number: %d\nInt Number: %d\nByte Number Narrowing Casting: %d\n\n",
            byteNum, shortNum, intNum, byteNumNarrow
    );

    // # Example Number Overflow:
    int intNumNarrow = 1000;
    byte byteNumOverflow = (byte) intNum;
    System.out.printf(
            "# Conversion Type Data Number Overflow\nInt Number: %d\nByte Number Overflow: %d (Is Not Correct Number)\n\n",
            intNumNarrow, byteNumOverflow
    );

  }
}
