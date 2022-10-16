package lesson7.task2;

public class Accountant implements Printable {

    private static final String JOB_TITLE = "Accountant";

    @Override
    public void printJobTitle() {
        System.out.println(JOB_TITLE);
    }
}
