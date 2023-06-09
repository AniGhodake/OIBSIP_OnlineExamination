import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SessionFrame extends JFrame {
    private UserProfile userProfile;
    private JLabel timerLabel;
    private JButton closeButton;
    private JButton logoutButton;
    private TimerThread timerThread;

    public SessionFrame(UserProfile userProfile) {
        this.userProfile = userProfile;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Session");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create GUI components (JLabel, JButtons) for session
        // Display the user's name
        
        // Add event listeners to handle close and logout button clicks
        
        // Start the timer thread with a specified duration (e.g., 10 minutes)
        timerThread = new TimerThread(10);
        timerThread.start();
    }
}
