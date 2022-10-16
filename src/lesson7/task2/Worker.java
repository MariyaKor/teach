package lesson7.task2;

public class Worker implements Printable {

    private static final String JOB_TITLE = "Worker";

    @Override
    public void printJobTitle() {
        System.out.println(JOB_TITLE);
    }

}

