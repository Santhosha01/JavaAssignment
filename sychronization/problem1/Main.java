package sychronization.problem1;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new PrintTask(printer, "Document 1"));
        Thread thread2 = new Thread(new PrintTask(printer, "Document 2"));
        thread1.start();
        thread2.start();
    }
}
