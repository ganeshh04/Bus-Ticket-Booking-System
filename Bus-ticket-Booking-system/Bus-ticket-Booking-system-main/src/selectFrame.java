import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class selectFrame extends JFrame {
    JFrame frame;
    String fromLocation;
    String toLocation;
    selectFrame() {
        this.setTitle("Location Selector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.setLayout(null);
        JLabel from = new JLabel("From ");
        JLabel to = new JLabel("to ");
        from.setBounds(300,100,50,50);
        to.setBounds(300,200,50,50);
        String[] startlocations = {"Hyderabad", "Chennai", "Tirupati", "Jaipur"};
        String[] endlocations = {"Hyderabad", "Chennai", "Tirupati", "Jaipur"};

        JComboBox<String> location1 = new JComboBox<>(startlocations);
        location1.setBounds(400, 100, 200, 50);

        JComboBox<String> location2 = new JComboBox<>(endlocations);
        location2.setBounds(400, 200, 200, 50);

        JButton sleeperBus = new JButton("Search for a bus");
        sleeperBus.setBounds(300,300,300,50);

        location1.addActionListener(e -> {
            fromLocation = (String) location1.getSelectedItem();
        });

        location2.addActionListener(e -> {
            toLocation = (String) location2.getSelectedItem();
        });

        sleeperBus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(fromLocation.equals(toLocation)) {
                    JOptionPane.showMessageDialog(frame, "Invalid");
                }
                else {
                    try (BufferedReader br = new BufferedReader(new FileReader("Busses.txt"))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] creds = line.split(",");
                            if (creds[0].equals(fromLocation) && creds[1].equals(toLocation)) {
                                if(creds[2].equals("sleeper")){
                                    busFrame ShowOptions = new busFrame(creds[0], creds[1],creds[2]);
                                }
                                else if (creds[2].equals("normal")) {

                                }
                            }
                        }
                    } catch (IOException E) {
                        E.printStackTrace();
                    }
                }
            }
        });

        this.add(sleeperBus);
        this.add(location1);
        this.add(location2);
        this.add(from);
        this.add(to);
        this.setVisible(true);
    }
}