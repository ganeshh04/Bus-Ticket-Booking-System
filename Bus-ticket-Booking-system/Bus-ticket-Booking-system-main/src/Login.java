import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.*;
public class Login extends JFrame {
    JFrame frame;

    Login() {
        frame = new JFrame("Login");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        userLabel.setBounds(30, 30, 80, 25);
        passLabel.setBounds(30, 70, 80, 25);
        userField.setBounds(120, 30, 150, 25);
        passField.setBounds(120, 70, 150, 25);
        loginButton.setBounds(520, 200, 100, 25);
        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);
        frame.setSize(650, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());
                if (FindUser(username, password)) {
                    frame.dispose();
                    selectFrame call = new selectFrame();
                    call.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });
    }

    public boolean FindUser(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] creds = line.split(",");
                if (creds.length == 2) {
                    if (creds[0].equals(username) && creds[1].equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
