import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddBus extends JFrame{
    String fromLocation;
    String toLocation;
    AddBus(){

        JFrame This = new JFrame("Add your bus");
        This.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        This.setSize(800, 500);
        This.setLayout(null);
        JLabel from = new JLabel("From ");
        JLabel to = new JLabel("to ");
        from.setBounds(300,100,50,50);
        to.setBounds(300,200,50,50);
        String[] startlocations = {"Hyderabad", "Chennai", "Tirupati", "Jaipur"};
        String[] endlocations = {"Hyderabad", "Chennai", "Tirupati", "Jaipur"};

        JComboBox<String> loc1 = new JComboBox<>(startlocations);
        loc1.setBounds(400, 100, 200, 50);

        JComboBox<String> location2 = new JComboBox<>(endlocations);
        location2.setBounds(400, 200, 200, 50);

        JButton sleeperBus = new JButton("Sleeper Bus");
        JButton normalBus = new JButton("Normal Bus");
        sleeperBus.setBounds(300,400,90,50);
        normalBus.setBounds(400,400,90,50);

        JTextField Time = new JTextField();
        Time.setBounds(400,300,90,50);

        This.add(from);
        This.add(to);
        This.add(loc1);
        This.add(location2);
        This.add(sleeperBus);
        This.add(normalBus);
        This.add(Time);

        loc1.addActionListener(e -> {
            fromLocation = (String) loc1.getSelectedItem();
        });

        location2.addActionListener(e -> {
            toLocation = (String) location2.getSelectedItem();
        });

        sleeperBus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String Time_given = Time.getText();
                    This.dispose();
                    File file = new File("Busses.txt");
                    FileWriter fw = new FileWriter(file,true);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println(fromLocation + "," + toLocation + "," + "sleeper," + Time_given + ",1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1");

                    pw.close();
                }
                catch (IOException E) {
                    System.err.println("An error occurred while handling the file: " + E.getMessage());
                    E.printStackTrace();
                }
            }
        });
        normalBus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String Time_given = Time.getText();
                    This.dispose();
                    File file = new File("Busses.txt");
                    FileWriter fw = new FileWriter(file,true);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println(fromLocation + "," + toLocation + "," + "normal," + Time_given + ",1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1");

                    pw.close();
                }
                catch (IOException E) {
                    E.printStackTrace();
                }
            }
        });

        This.setVisible(true);
    }
}
