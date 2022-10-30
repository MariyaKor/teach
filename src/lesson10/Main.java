package lesson10;

import static lesson10.StringUtils.*;

public class Main {
    public static void main(String[] args) {
        final String STRING_TEST = "9999-abc-1678-ABC-2a3b";
        final String STRING_TEST_ADDITIONAL = "I like programming on JAVA and Scala";
        showOnlyNumbers(STRING_TEST);
        replace(STRING_TEST);
        getStringInNewFormat(STRING_TEST);
        getStringInUpperCase(STRING_TEST);
        isContains(STRING_TEST);
        startsWithSubsequence(STRING_TEST);
        endsWithSubsequence(STRING_TEST);
        additionalTaskPrintWords(STRING_TEST_ADDITIONAL);
        additionalTaskDuplicatedLetters(STRING_TEST_ADDITIONAL);
    }
}
