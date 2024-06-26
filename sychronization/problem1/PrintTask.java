package sychronization.problem1;

public class PrintTask implements Runnable{
    private Printer printer;
    private String documentName;

    public PrintTask(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { 
            printer.printDocument(documentName);
        }
    }
}