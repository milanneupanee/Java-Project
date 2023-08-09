package CreatingGUI;
import javax.swing.*;
import java.awt.*;
public class PieChartExample extends JPanel {

    private final int[] data = {30, 20, 50}; // Sample data for the pie chart
    public PieChartExample() {
        setPreferredSize(new Dimension(400, 400));
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int total = 0;
        // Calculate the total value for all data points
        for (int i=0;i<data.length;i++){
            total += data[i];
        }
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        int startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round((360.0 * data[i]) / total);
            g.setColor(colors[i]);
            g.fillArc(width / 2 - 100, height / 2 - 100, 200, 200, startAngle, arcAngle);
            startAngle += arcAngle;
        }
    }
    public static void main(String[] args) {
            JFrame frame = new JFrame("Pie Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new PieChartExample());
            frame.pack();
            frame.setVisible(true);
        }
    }

