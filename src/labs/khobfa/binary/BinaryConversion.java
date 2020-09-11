package labs.khobfa.binary;

public class BinaryConversion {

    public long convertToDecimal(String binary) {
        long conversion = 1;
        long result = 0;

        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }

        return result;
    }
}
