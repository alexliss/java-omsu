package october.strings;

import exceptions.WrongValueException;

public class StringProcessor {

    public static String copies(String s, int n) throws WrongValueException {
        if (n < 0) throw new WrongValueException("N cannot be negative.");
        if (n == 0) return "";
        String newS = "";
        for (int i = 0; i < n; i++) {
            newS = newS + s;
        }
        return newS;
    }

    public static int entryNumber(String string, String substring) {
        int result = 0;
        if (string.equals(substring)) return 1;
        if (!string.equals("")) {
            while (string.contains(substring)) {
                string = string.substring(string.indexOf(substring) + 1);
                result++;
            }
        }
        return result;
    }

    public static String replaceNumbers(String string) {
        string = string.replace("1", "one");
        string = string.replace("2", "two");
        string = string.replace("3", "three");
        return string;
    }

    public static void deleteEverySecond(StringBuilder string) {
        for (int i = 1; i < string.length(); i++) {
            string.deleteCharAt(i);
        }
    }



}