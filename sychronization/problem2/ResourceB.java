package sychronization.problem2;

public class ResourceB{
    public void methodB(ResourceA resourceA) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceA) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");
            }
        }
    }
}