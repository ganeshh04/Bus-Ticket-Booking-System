import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class busFrame {
    String from;
    String to;
    String Type;
    busFrame(String FROM, String TO, String Type) throws IOException {
        this.from = FROM;
        this.to = TO;
        this.Type = Type;
        String filePath = "Busses.txt";
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("Busses.txt"));
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        JFrame frame = new JFrame("Bus Selector with Scroll");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel buttonPanel = new JPanel();

        for (int i=0;i< lines.size();i++) {
            String line = lines.get(i);
            String[] words = line.split(",");
            if (words[0].equals(from) && words[1].equals(to)) {

                if (words[2].equals("sleeper")) {
                    JButton button = new JButton(words[2] + " at " +words[3]);
                    buttonPanel.add(button);
                    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
                    int finalK = i;
                    button.addActionListener(e -> {
                        SleeperBus Bus = new SleeperBus(finalK);
                    });
                } else if (words[2].equals("normal")) {
                    JButton button = new JButton(words[2] + " at " + words[3]);
                    buttonPanel.add(button);
                    buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
                    int finalK = i;
                    button.addActionListener(e -> {
                        NormalBus Bus = new NormalBus(finalK);
                    });
                }
            }
        }

        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(380, 350));

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }

}
