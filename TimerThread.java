public class TimerThread extends Thread {
    private int minutes;
    private int seconds;

    public TimerThread(int minutes) {
        this.minutes = minutes;
        this.seconds = 0;
    }

    @Override
    public void run() {
        try {
            while (minutes > 0 || seconds > 0) {
                Thread.sleep(1000); // Pause for 1 second
                if (seconds > 0) {
                    seconds--;
                } else {
                    minutes--;
                    seconds = 59;
                }
                // Update the timer display in the SessionFrame
            }
            // Auto-submit the answers when the timer expires
            // Handle the submission logic
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
