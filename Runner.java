/**
 * Runner
 */
public class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HELLO" + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {

            }
        }

    }
}