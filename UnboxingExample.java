public class UnboxingExample {

    public static void main(String[] args) {
        // Explicit unboxing for Integer to int
        Integer intObject = new Integer(66);
        int intValue = intObject.intValue();  // Explicit unboxing Integer to int
        System.out.println("Integer to int: " + intValue);

        // Explicit unboxing for Double to double
        Double doubleObject = new Double(20.5);
        double doubleValue = doubleObject.doubleValue();  // Explicit unboxing Double to double
        System.out.println("Double to double: " + doubleValue);

        // Explicit unboxing for Boolean to boolean
        Boolean boolObject = new Boolean(true);
        boolean boolValue = boolObject.booleanValue();  // Explicit unboxing Boolean to boolean
        System.out.println("Boolean to boolean: " + boolValue);

        // Explicit unboxing for Character to char
        Character charObject = new Character('A');
        char charValue = charObject.charValue();  // Explicit unboxing Character to char
        System.out.println("Character to char: " + charValue);

        // Explicit unboxing for Byte to byte
        Byte byteObject = new Byte((byte) 5);
        byte byteValue = byteObject.byteValue();  // Explicit unboxing Byte to byte
        System.out.println("Byte to byte: " + byteValue);

        // Explicit unboxing for Short to short
        Short shortObject = new Short((short) 100);
        short shortValue = shortObject.shortValue();  // Explicit unboxing Short to short
        System.out.println("Short to short: " + shortValue);

        // Explicit unboxing for Long to long
        Long longObject = new Long(1000L);
        long longValue = longObject.longValue();  // Explicit unboxing Long to long
        System.out.println("Long to long: " + longValue);

        // Explicit unboxing for Float to float
        Float floatObject = new Float(15.75f);
        float floatValue = floatObject.floatValue();  // Explicit unboxing Float to float
        System.out.println("Float to float: " + floatValue);
    }
}
