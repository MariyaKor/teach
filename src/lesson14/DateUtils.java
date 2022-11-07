package lesson14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.next;

public class DateUtils {
    public static String getDayOfTheWeek(LocalDate date) {
        if (date != null) {
            DayOfWeek day = date.getDayOfWeek();
            return day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        }
        return null;
    }

    public static LocalDate getNextTuesday() {
        return LocalDate.now().with(next(DayOfWeek.TUESDAY));
    }

}
