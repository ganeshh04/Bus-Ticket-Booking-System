import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

class MainFrame extends JFrame{
    MainFrame(){
        this.setTitle("Book a bus");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1300,800);
        this.getContentPane().setBackground(new Color(255, 25,50));
    }

    public void actionPerformed(ActionEvent Logged_in) {
        Login user = new Login();
    }

    public void actionDone(ActionEvent SignedUp){
        Sign_up userSignUP = new Sign_up();
    }

    public void actionAdmin(ActionEvent Admin){
        AdminLogin admin = new AdminLogin();
    }
}
