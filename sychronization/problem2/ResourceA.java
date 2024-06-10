package sychronization.problem2;

public class ResourceA{
    public void methodA(ResourceB resourceB) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA");

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resourceB) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB");
            }
        }
    } 
}