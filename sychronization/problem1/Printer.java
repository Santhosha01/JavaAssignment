package sychronization.problem1;

public class Printer{
  public void printDocument(String documentName) {
    synchronized (this) {
        System.out.println("Printing document: " + documentName + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}