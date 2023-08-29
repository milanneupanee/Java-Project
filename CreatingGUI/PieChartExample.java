package CreatingGUI;
import javax.swing.*;
import java.awt.*;
public class PieChartExample extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] data = {30, 20, 35}; // Sample data for the pie chart
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        String[] label={"Math","C","C++"};

        int width =400;
        int height =400;
        int total = 0;
        int startAngle = 0;
        //for boxes
        int boxX=20;
        int boxY=20;
        // Calculate the total value for all data
        for (int i=0;i<data.length;i++){
            total += data[i];
        }
        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round((360.0 * data[i]) / total);
            g.setColor(colors[i]);
            g.fillArc(width / 2 - 100, height / 2 - 100, 200, 200, startAngle, arcAngle);
            startAngle += arcAngle;
            //for boxes
            g.fillRect(boxX,boxY,10,10);
            g.setColor(Color.black);
            g.drawString(label[i],boxX+20,boxY+10);
            boxY+=20;
        }
    }
    public static void main(String[] args) {
            JFrame frame = new JFrame("Pie Chart Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new PieChartExample());
            frame.setSize(400,400);
            frame.setVisible(true);
        }
    }

