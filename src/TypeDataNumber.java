public class TypeDataNumber {
  public static void main(String[] args) {
    // # Integer Number
    //
    //  - byte:
    //      - min: -128
    //      - max: 127
    //      - size: 1 byte
    //      - default: 0
    //
    //  - short:
    //      - min: -32,768
    //      - max: 32767
    //      - size: 2 bytes
    //      - default: 0
    //
    //  - int:
    //      - min: -2,147,483,648
    //      - max: 2,147,483,647
    //      - size: 4 bytes
    //      - default: 0
    //
    //  - long:
    //      - min: -9,223,372,036,854,775,808
    //      - max: 9,223,372,036,854,775,807
    //      - size: 8 bytes
    //      - default: 0
    //
    // # Example:

    byte byteNum = 100;
    short shortNum = 10000;
    int intNum = 1000000;
    long longNum = 1000000000;
    // can be 'l' or 'L'
    long longNumWithL = 1000000000L;

    System.out.printf(
            "# Integer Number\nByte Number: %d\nShort Number: %d\nInt Number: %d\nLong Number: %d\nLong Number With 'L': %d\n\n",
            byteNum, shortNum, intNum, longNum, longNumWithL
    );

    // # Floating Point Number
    //
    //  - float:
    //      - min: 3.4e-038
    //      - max: 3.4e+038
    //      - size: 4 bytes
    //      - default: 0.0
    //
    //  - double:
    //      - min: 1.7e-308
    //      - max: 1.7e+308
    //      - size: 8 bytes
    //      - default: 0.0
    //
    // # Example:

    float floatNumWithFUpper = 12.345F;
    float floatNumWithFLower = 12.345f;
    double doubleNum = 67.8910;

    System.out.printf(
            "# Floating Point Number\nFloat Number With 'F': %f\nFloat Number With 'f': %f\nDouble Number: %f\n\n",
            floatNumWithFUpper, floatNumWithFLower, doubleNum
    );

    // # Literals Code
    //
    //  - Decimal literals (Base 10):
    //      In this form, the allowed digits are 0-9.
    //
    //  - Octal literals (Base 8):
    //      In this form, the allowed digits are 0-7.
    //
    //  - Hex-decimal literals (Base 16):
    //      In this form, the allowed digits are 0-9, and characters are a-f.
    //      We can use both uppercase and lowercase characters as we know that java is
    //      a case-sensitive programming language, but here java is not case-sensitive.
    //
    //  - Binary literals (Base 2):
    //      From 1.7 onward, we can specify literal value even in binary form also,
    //      allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B.
    //
    // # Example:

    int decimalLiteral = 101;

    // The octal number should be prefixed with 0.
    int octalLiteral = 0100;

    // The hex-decimal number should be prefixed with 0X or 0x.
    int hexDecimalLiteral = 0xFace;

    // The binary number should be prefixed with 0b or 0B.
    int binaryLiteral = 0b1111;

    System.out.printf(
            "# Literals Code\n(Base 10) Decimal Literal: %d\n(Base  8) Octal Literal: %d\n(Base 16) Hex Decimal Literal: %d\n(Base  2) Binary Literal: %d\n\n",
            decimalLiteral, octalLiteral, hexDecimalLiteral, binaryLiteral
    );


    // # Underscore in Numeric
    //  - Note:
    //      - In Java SE 7 and later, any number of underscore characters (_)
    //        can appear anywhere between digits in a numerical literal.
    //      - Recommended when using long number to easily read.
    //      - Feel free to put an underscore in the gaps between the numbers
    //
    //  - Source:
    //      - https://docs.oracle.com/javase/8/docs/technotes/guides/language/underscores-literals.html
    //      - https://youtu.be/jiUxHm9l1KY?list=PL-CtdCApEFH-p_Q2GyK4K3ORoAT0Yt7CX&t=3053
    //
    // # Example:

    long balance = 1_000_000_000_000L;
    long sum = 60_000_000;

    System.out.printf(
            "# Underscore in Numeric\nExample 1: %d\nExample 2: %d\n\n",
            balance, sum
    );
  }
}
