package lesson3;

/**
 * Utilitarian class to print name of season by number of month
 */
public class SeasonUtils {


    public static void defineSeasonSwitchCase(final int numberOfMonth) {
        switch (numberOfMonth) {
            case 1, 2, 12 -> System.out.println("winter");
            case 3, 4, 5 -> System.out.println("spring");
            case 6, 7, 8 -> System.out.println("summer");
            case 9, 10, 11 -> System.out.println("fall");
            default -> System.out.println("Incorrect numberOfMonth");
        }
    }

    public static void defineSeasonIfElse(final int numberOfMonth) {
        if (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12) {
            System.out.println("winter");
        } else if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) {
            System.out.println("spring");
        } else if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8) {
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }
    }

}
