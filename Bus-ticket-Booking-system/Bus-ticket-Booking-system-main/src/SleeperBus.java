import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SleeperBus extends JFrame{
    JPanel Panel1U;
    JPanel Panel2Ua;
    JPanel Panel2Ub;
    JPanel Panel1L;
    JPanel Panel2La;
    JPanel Panel2Lb;
    JButton[] ButtonsU = new JButton[5];
    JButton[] Buttons1U1 = new JButton[5];
    JButton[] Buttons1U2 = new JButton[5];
    JButton[] ButtonsL = new JButton[5];
    JButton[] Buttons1L1 = new JButton[5];
    JButton[] Buttons1L2 = new JButton[5];

    SleeperBus(int lineNum){
        this.setTitle("Book a seat!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(1100,800);
        this.getContentPane().setBackground(new Color(100,150,200));

        List<String> lines = null;
        try{
            lines = Files.readAllLines(Paths.get("Busses.txt"));
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Panel1U = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+1 + 15;
            ButtonsU[i] = new JButton(r + " U");
            List<String> finalLines = lines;
            ButtonsU[i].addActionListener(e -> {
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
        Panel1U.setBounds(100,150,80,500);
        Panel1U.setBackground(Color.red);
        Panel1U.setLayout(new GridLayout(5,1));
        for(JButton button : ButtonsU){
            Panel1U.add(button);
        }
        Panel1L = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+1;
            ButtonsL[i] = new JButton(r + " L");
            List<String> finalLines = lines;
            ButtonsL[i].addActionListener(e -> {
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
        Panel1L.setBounds(470,150,80,500);
        Panel1L.setBackground(Color.red);
        Panel1L.setLayout(new GridLayout(5,1));
        for(JButton button : ButtonsL){
            Panel1L.add(button);
        }

        Panel2Ua = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+2 + 15;
            Buttons1U1[i] = new JButton(r + " U");
            List<String> finalLines = lines;
            Buttons1U1[i].addActionListener(e -> {
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
        Panel2Ua.setBounds(200,150,80,500);
        Panel2Ua.setBackground(Color.red);
        Panel2Ua.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons1U1){
            Panel2Ua.add(button);
        }

        Panel2Ub = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+3 + 15;
            Buttons1U2[i] = new JButton(r + " U");
            List<String> finalLines = lines;
            Buttons1U2[i].addActionListener(e -> {
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
        Panel2Ub.setBounds(270,150,80,500);
        Panel2Ub.setBackground(Color.red);
        Panel2Ub.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons1U2) {
            Panel2Ub.add(button);
        }
        Panel2La = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+2;
            Buttons1L1[i] = new JButton(r + " L");
            List<String> finalLines = lines;
            Buttons1L1[i].addActionListener(e -> {
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
        Panel2La.setBounds(570,150,80,500);
        Panel2La.setBackground(Color.red);
        Panel2La.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons1L1) {
            Panel2La.add(button);
        }

        Panel2Lb = new JPanel();
        for(int i=0;i<5;i++){
            int r = 3*i+3;
            Buttons1L2[i] = new JButton(r + " L");
            List<String> finalLines = lines;
            Buttons1L2[i].addActionListener(e -> {
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
        Panel2Lb.setBounds(640,150,80,500);
        Panel2Lb.setBackground(Color.red);
        Panel2Lb.setLayout(new GridLayout(5,1));
        for(JButton button : Buttons1L2) {
            Panel2Lb.add(button);
        }

        this.add(Panel1U);
        this.add(Panel1L);
        this.add(Panel2Ua);
        this.add(Panel2Ub);
        this.add(Panel2La);
        this.add(Panel2Lb);
        this.setVisible(true);
    }
}
