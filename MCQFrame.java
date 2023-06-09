import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MCQFrame extends JFrame {
    private UserProfile userProfile;
    private JLabel timerLabel;
    private JButton submitButton;

    public MCQFrame(UserProfile userProfile) {
        this.userProfile = userProfile;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MCQs");
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create GUI components (JLabels, JCheckBoxes, JButton) for MCQs
        // Display the list of available exams (C, C++, Java, Python, AWS CCP)
        // On selecting an exam, display 20 MCQ questions and set the time limit to 10 minutes
        
        // Add event listener to handle submit button click
        // Collect selected answers and calculate the score
        
        // Display the user's name and score for the exam
        String name = userProfile.getFirstName() + " " + userProfile.getLastName();
        int score = calculateScore(); // Your implementation for score calculation
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nScore: " + score);
        
        // Open the SessionFrame
        SessionFrame sessionFrame = new SessionFrame(userProfile);
        sessionFrame.setVisible(true);
        dispose();
    }

    private int calculateScore() {
        // Your implementation to calculate the score
        return 0;
    }
}
