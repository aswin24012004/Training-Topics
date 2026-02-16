public class VirtualThreadExample {
    public static void main(String[] args) {
        // Create a virtual thread directly
        Thread vt = Thread.ofVirtual().start(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });

        try {
            vt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                System.out.println("Task running in virtual thread");
            });
        }
    }
}
