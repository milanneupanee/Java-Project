package CreatingGUI;

import javax.swing.*;
import java.awt.*;

class BarGraph extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] values = {46, 86, 66 ,99};
        String[] labels = {"JAVA", "MATH", "DBMS","C"};
        Color[] colors = {Color.red, Color.green, Color.blue,Color.black};

        int x = 50; // Starting X position for each bar
        int height = 200; // Height of each bar
        for (int i = 0; i < values.length; i++) {
            int y = height - values[i]; // Calculate the Y position of the bar
            g.setColor(colors[i]);
            g.fillRect(x, y, 40, values[i]);
            g.setColor(Color.black);
            g.drawString(labels[i], x, height +10); // Draw the label below each bar
            x += 50; // Increase X position for the next bar
        }
    }
}
public class BarGraphExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bar Chart");
        BarGraph bg = new BarGraph();
        frame.add(bg);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
