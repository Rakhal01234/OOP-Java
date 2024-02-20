class DisplayThread extends Thread {
    private String message;
    private int delay;
    private int repetitions;

    public DisplayThread(String message, int delay, int repetitions) {
        this.message = message;
        this.delay = delay;
        this.repetitions = repetitions;
    }

    public void run() {
        // Loop for repetitions
        for (int i = 0; i < repetitions; i++) {
            System.out.println(message);
            try {
                if (i == 0 && message.equals("CSE")) {
                    Thread.sleep(2 * 1000); // Initial delay only for the first output of CSE
                } else {
                    Thread.sleep(delay * 1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Repeat the entire sequence 5 times
        for (int repetition = 0; repetition < 5; repetition++) {
            // Create BMSCE thread
            DisplayThread bmsThread = new DisplayThread("BMS College of Engineering", 10, 1);

            // Start BMSCE thread
            bmsThread.start();

            // Create CSE thread
            DisplayThread cseThread = new DisplayThread("CSE", 2, 4); // Print CSE 4 times with 2 seconds interval

            // Start CSE thread
            cseThread.start();

            try {
                // Wait for the BMSCE thread to complete if needed
                bmsThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                // Wait for the CSE thread to complete before starting the next repetition
                cseThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
