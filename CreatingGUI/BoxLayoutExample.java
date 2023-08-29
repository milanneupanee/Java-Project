package CreatingGUI;
import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BoxLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical layout

            JButton button1 = new JButton("Short");
            JButton button2 = new JButton("A Bit Longer");
            JButton button3 = new JButton("Even Longer Button");
            JButton button4 = new JButton("The Longest Button Here");

            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
