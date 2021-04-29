package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int result = 0;
        for (char oi : input.toCharArray()) {
            if (Character.isDigit(oi)) {
                result += Character.getNumericValue(oi);
            }
        }
        return result;
    }
}
