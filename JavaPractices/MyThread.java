package practices;


class Test extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

public class MyThread {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
