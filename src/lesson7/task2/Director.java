package lesson7.task2;

public class Director implements Printable {
    private static final String JOB_TITLE = "Director";

    @Override
    public void printJobTitle() {
        System.out.println(JOB_TITLE);
    }
}
