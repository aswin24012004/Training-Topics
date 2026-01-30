package practices;

class Task implements Runnable{
	public void run() {
        System.out.println("Task running");
    }

}
public class TreadRunnable {
	public static void main(String args[]) {
		Thread t = new Thread(new Task());
		t.start();
	}
}
