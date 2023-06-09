import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    private Map<String, UserProfile> userProfiles;

    public LoginFrame() {
        userProfiles = new HashMap<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create GUI components (JLabels, JTextFields, JButtons) for login form
        // Include create account functionality (take profile picture, first name, last name, PRN number, username, and password)
        // Validate username and password against userProfiles map
        
        // If login is successful, open the ProfileFrame
        ProfileFrame profileFrame = new ProfileFrame(userProfiles.get(username));
        profileFrame.setVisible(true);
        dispose();
    }
}
