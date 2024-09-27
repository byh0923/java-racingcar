package calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static final String REGEX = ",|:";
    public static final String PATTERN = "//(.)\n(.*)";

    public int splitAndSum(String text) {
        return split(text);
    }

    private static int split(String text) {
        int result = 0;
        String[] splitText = text.split(",|:");
        Matcher m = Pattern.compile(PATTERN).matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            splitText = m.group(2).split(customDelimiter);
        }
        return sum(splitText);
    }

    private static int sum(String[] splitText) {
        int result = 0;
        for (String s : splitText) {
            result +=Integer.parseInt(s);
        }
        return result;
    }

}
