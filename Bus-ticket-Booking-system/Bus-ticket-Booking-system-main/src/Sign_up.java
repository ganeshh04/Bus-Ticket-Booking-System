import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sign_up extends JFrame {
    JFrame SignUp;
    JTextField Username;
    JTextField Password;
    File file = new File("users.txt");
    Sign_up() {
        SignUp = new JFrame("Sign Up");
        SignUp.setBounds(10, 0, 1050, 700);
        SignUp.setLayout(null);
        SignUp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        Username = new JTextField();
        Password = new JTextField();
        userLabel.setBounds(30, 30, 80, 25);
        passLabel.setBounds(30, 70, 80, 25);
        Username.setBounds(120, 30, 150, 25);
        Password.setBounds(120, 70, 150, 25);
        SignUp.add(userLabel);
        SignUp.add(passLabel);
        JButton SignUP = new JButton("Sign up");
        SignUP.setBounds(80, 200, 100, 25);
        SignUp.add(SignUP);
        SignUp.add(Username);
        SignUp.add(Password);
        SignUP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    FileWriter fw = new FileWriter(file,true);
                    PrintWriter pw = new PrintWriter(fw);
                    String username = Username.getText();
                    String password = Password.getText();
                    pw.print(username);
                    pw.print(",");
                    pw.println(password);
                    pw.close();
                    SignUp.dispose();
                }
                catch (IOException E) {
                    System.err.println("An error occurred while handling the file: " + E.getMessage());
                    E.printStackTrace();
                }
            }
        });
        SignUp.setVisible(true);
    }
}
