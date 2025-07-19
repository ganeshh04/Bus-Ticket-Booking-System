import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NormalBus extends JFrame{
    JPanel Panel1a;
    JPanel Panel2a;
    JPanel Panel1b;
    JPanel Panel2b;
    JPanel Panel2c;
    JButton[] Buttons_a = new JButton[5];
    JButton[] Buttons_b = new JButton[5];
    JButton[] Buttons1_a = new JButton[5];
    JButton[] Buttons1_b = new JButton[5];
    JButton[] Buttons1_c = new JButton[5];
    NormalBus(int lineNum){
        this.setTitle("Book a seat!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(1100,800);
        this.getContentPane().setBackground(new Color(40,100,40));
        List<String> lines = null;
        try{
            lines = Files.readAllLines(Paths.get("Busses.txt"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        String Seat = lines.get(lineNum);
        String[] words = Seat.split(",");

        Panel1a = new JPanel();
        for(int i=0;i<5;i++){
            int r = (5*i)+1;
            Buttons_a[i] = new JButton("" + r);
            List<String> finalLines = lines;
            Buttons_a[i].addActionListener(e -> {
                try {
                    String initially = finalLines.get(lineNum);
                    String[] fields = initially.split(",");

                    System.out.println("Original seat value: " + fields[r + 3]);

                    if (fields[r + 3].equals("1")) {
                        fields[r + 3] = "0";
                        String newLine = String.join(",", fields);
                        finalLines.set(lineNum, newLine);
                        Files.write(Paths.get("Busses.txt"), finalLines);
                        System.out.println("Updated seat at index " + (r + 3));
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "That seat is already taken.");
                    }
                }
                catch (IOException E) {
                    System.err.println("Error: " + E.getMessage());
                }            });
        }
        Panel1a.setBounds(100,50,150,600);
        Panel1a.setBackground(Color.red);
        Panel1a.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons_a){
            Panel1a.add(button);
        }

        Panel1b = new JPanel();
        for(int i=0;i<5;i++){
            int r = 5*i + 2;
            Buttons_b[i] = new JButton(""+ r);
            List<String> finalLines = lines;
            Buttons_b[i].addActionListener(e -> {
                try {
                    String initially = finalLines.get(lineNum);
                    String[] fields = initially.split(",");

                    System.out.println("Original seat value: " + fields[r + 3]);

                    if (fields[r + 3].equals("1")) {
                        fields[r + 3] = "0";
                        String newLine = String.join(",", fields);
                        finalLines.set(lineNum, newLine);
                        Files.write(Paths.get("Busses.txt"), finalLines);
                        System.out.println("Updated seat at index " + (r + 3));
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "That seat is already taken.");
                    }
                }
                catch (IOException E) {
                    System.err.println("Error: " + E.getMessage());
                }
            });
        }
        Panel1b.setBounds(250,50,150,600);
        Panel1b.setBackground(Color.red);
        Panel1b.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons_b){
            Panel1b.add(button);
        }

        Panel2a = new JPanel();
        for(int i=0;i<5;i++){
            int r = 5*i+3;
            Buttons1_a[i] = new JButton(""+ r);
            List<String> finalLines = lines;
            Buttons1_a[i].addActionListener(e -> {
                try {
                    String initially = finalLines.get(lineNum);
                    String[] fields = initially.split(",");

                    System.out.println("Original seat value: " + fields[r + 3]);

                    if (fields[r + 3].equals("1")) {
                        fields[r + 3] = "0";
                        String newLine = String.join(",", fields);
                        finalLines.set(lineNum, newLine);
                        Files.write(Paths.get("Busses.txt"), finalLines);
                        System.out.println("Updated seat at index " + (r + 3));
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "That seat is already taken.");
                    }
                }
                catch (IOException E) {
                    System.err.println("Error: " + E.getMessage());
                }            });
        }

        Panel2a.setBounds(500,50,150,600);
        Panel2a.setBackground(Color.red);
        Panel2a.setLayout(new GridLayout(5,3));
        for(JButton button : Buttons1_a){
            Panel2a.add(button);
        }

        Panel2b = new JPanel();

        for(int i=0;i<5;i++){
            int r = 5*i+4;
            Buttons1_b[i] = new JButton(""+ r);
            List<String> finalLines = lines;
            Buttons1_b[i].addActionListener(e -> {
                try {
                    String initially = finalLines.get(lineNum);
                    String[] fields = initially.split(",");

                    System.out.println("Original seat value: " + fields[r + 3]);

                    if (fields[r + 3].equals("1")) {
                        fields[r + 3] = "0";
                        String newLine = String.join(",", fields);
                        finalLines.set(lineNum, newLine);
                        Files.write(Paths.get("Busses.txt"), finalLines);
                        System.out.println("Updated seat at index " + (r + 3));
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "That seat is already taken.");
                    }
                }
                catch (IOException E) {
                    System.err.println("Error: " + E.getMessage());
                }            });
        }

        Panel2b.setBounds(650,50,150,600);
        Panel2b.setBackground(Color.red);
        Panel2b.setLayout(new GridLayout(5,3));
        for(JButton button : Buttons1_b){
            Panel2b.add(button);
        }

        Panel2c = new JPanel();

        for(int i=0;i<5;i++){
            int r = 5*i+5;
            Buttons1_c[i] = new JButton(""+ r);
            List<String>  finalLines = lines;
            Buttons1_c[i].addActionListener(e -> {
                try {
                    String initially = finalLines.get(lineNum);
                    String[] fields = initially.split(",");

                    System.out.println("Original seat value: " + fields[r + 3]);

                    if (fields[r + 3].equals("1")) {
                        fields[r + 3] = "0";
                        String newLine = String.join(",", fields);
                        finalLines.set(lineNum, newLine);
                        Files.write(Paths.get("Busses.txt"), finalLines);
                        System.out.println("Updated seat at index " + (r + 3));
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "That seat is already taken.");
                    }
                }
                catch (IOException E) {
                    System.err.println("Error: " + E.getMessage());
                }            });
        }

        Panel2c.setBounds(800,50,150,600);
        Panel2c.setBackground(Color.red);
        Panel2c.setLayout(new GridLayout(5,3));
        for(JButton button : Buttons1_c){
            Panel2c.add(button);
        }

        this.add(Panel1a);
        this.add(Panel1b);
        this.add(Panel2a);
        this.add(Panel2b);
        this.add(Panel2c);

        this.setVisible(true);
    }
}
