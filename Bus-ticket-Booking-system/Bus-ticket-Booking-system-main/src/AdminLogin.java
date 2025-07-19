import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.io.*;

public class AdminLogin{

    AdminLogin(){
        JFrame frame = new JFrame("Login");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();

        userLabel.setBounds(30, 30, 80, 25);
        passLabel.setBounds(30, 70, 80, 25);
        userField.setBounds(120, 30, 150, 25);
        passField.setBounds(120, 70, 150, 25);
        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.setSize(650, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton Button = new JButton("Login");
        Button.setBounds(400,200,100,50);
        frame.add(Button);
        frame.setVisible(true);
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = userField.getText();
                String Password = passField.getText();
                if(Username.equals("Admin@123") && Password.equals("4dm1nPa55")){
                    frame.dispose();
                    Admin The_Admin = new Admin();
                    JButton addbus = new JButton("Add a bus");
                    addbus.setBounds(500,300,100,50);
                    addbus.addActionListener(The_Admin::Add_Bus);
                    The_Admin.add(addbus);
                    The_Admin.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }
        });
        frame.setVisible(true);
    }
}

