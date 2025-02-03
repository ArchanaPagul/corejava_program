public class AutoboxingExample {

    public static void main(String[] args) {
	System.out.println("Autoboxing");
        // Manual boxing for integer types using Integer.valueOf()
        int intValue = 10;
        Integer intObject = Integer.valueOf(intValue);  // Manually boxing int to Integer
        System.out.println("int to Integer: " + intObject);

        // Manual boxing for double types using Double.valueOf()
        double doubleValue = 20.5;
        Double doubleObject = Double.valueOf(doubleValue);  // Manually boxing double to Double
        System.out.println("Double to Double: " + doubleObject);

        // Manual boxing for boolean types using Boolean.valueOf()
        boolean boolValue = true;
        Boolean boolObject = Boolean.valueOf(boolValue);  // Manually boxing boolean to Boolean
        System.out.println("boolean to Boolean: " + boolObject);

        // Manual boxing for char types using Character.valueOf()
        char charValue = 'A';
        Character charObject = Character.valueOf(charValue);  // Manually boxing char to Character
        System.out.println("char to Character: " + charObject);

        // Manual boxing for byte types using Byte.valueOf()
        byte byteValue = 5;
        Byte byteObject = Byte.valueOf(byteValue);  // Manually boxing byte to Byte
        System.out.println("byte to Byte: " + byteObject);

        // Manual boxing for short types using Short.valueOf()
        short shortValue = 100;
        Short shortObject = Short.valueOf(shortValue);  // Manually boxing short to Short
        System.out.println("short to Short: " + shortObject);

        // Manual boxing for long types using Long.valueOf()
        long longValue = 1000L;
        Long longObject = Long.valueOf(longValue);  // Manually boxing long to Long
        System.out.println("long to Long: " + longObject);

        // Manual boxing for float types using Float.valueOf()
        float floatValue = 15.75f;
        Float floatObject = Float.valueOf(floatValue);  // Manually boxing float to Float
        System.out.println("float to Float: " + floatObject);
    }
}
