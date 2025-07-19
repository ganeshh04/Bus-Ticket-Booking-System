import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon Image = new ImageIcon("bus_pic_OOP.jpeg");

        MainFrame Frame = new MainFrame();
        Frame.setLayout(null);
        Frame.setIconImage(Image.getImage());

        JPanel StartPanel = new JPanel();
        StartPanel.setBounds(300,100,700,150);
        StartPanel.setOpaque(false);
        JLabel myLabel = new JLabel("Welcome to the BusBooking app!");
        Font customFont = new Font("Arial", Font.BOLD, 40);
        myLabel.setFont(customFont);
        StartPanel.add(myLabel);

        //Button for Login
        JButton Button = new JButton("Login");
        Button.setBounds(580, 325, 100, 50);
        Button.addActionListener(Frame::actionPerformed);
        Frame.add(Button);

        //Button for Sign in
        JButton Button1 = new JButton("Sign in");
        Button1.setBounds(580,400,100,50);
        Button1.addActionListener(Frame::actionDone);
        Frame.add(Button1);

        //Button for Admin
        JButton Button2 = new JButton("Admin");
        Button2.setBounds(580,250,100,50);
        Button2.addActionListener(Frame::actionAdmin);
        Frame.add(Button2);

        Frame.add(StartPanel);
        Frame.setVisible(true);
    }
}