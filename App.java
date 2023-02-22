/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();
        Runner runner2 = new Runner();
        runner2.start();

        Thread t1 = new Thread(new Runable());
        Thread t2 = new Thread(new Runable());
        t2.start();
        t1.start();
    }

}