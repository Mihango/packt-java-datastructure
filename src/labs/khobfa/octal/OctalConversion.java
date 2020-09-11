package labs.khobfa.octal;

public class OctalConversion {

    public long convertToDecimal(String octal) {
        long result = 0;

        for (int i = 0; i < octal.length() - 1; i++) {
            int j = Integer.parseInt(String.valueOf(octal.charAt(i)));
            result += (j * 8);
        }
        result += Integer.parseInt(String.valueOf(octal.charAt(octal.length() - 1)));
        return result;
    }
}
