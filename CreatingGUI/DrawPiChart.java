package CreatingGUI;
import javax.swing.*;
import java.awt.*;
class Pie{
        double value;
        Color color;
        public Pie(double value,Color color){
            this.value=value;
            this.color=color;
        }
    }
class PieChart extends JPanel{
    Pie[] pies = {
            new Pie(25,Color.blue),
            new Pie(15, Color.red),
            new Pie(8, Color.black)
    };
    public PieChart(){
        setSize(400,400);
    }
    public void paint(Graphics g){
        double total = 0.0D;
        for (Pie value : pies) {
            total += value.value;
        }
        double currentValue = 0.0;
        int startAngle;

        for (Pie pie : pies) {
            startAngle = (int) (currentValue * 360 / total);
            int arcAngle = (int) (pie.value * 360 / total);
            g.setColor(pie.color);
            g.fillArc(50, 100, 200, 200, startAngle, arcAngle);
            currentValue += pie.value;
        }
        g.setColor(Color.blue);
        g.fillRect(5,10,20,20);
        g.drawString("Support Virtual Class",28,22);
        g.setColor(Color.red);
        g.fillRect(5,35,20,20);
        g.drawString("Against Virtual Class",28,48);
        g.setColor(Color.black);
        g.fillRect(5,60,20,20);
        g.drawString("Neutral",28,72);
        }
}
    public class DrawPiChart extends JPanel {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.getContentPane().add(new PieChart());
            frame.setTitle("Pie chart");
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,360);
            frame.setVisible(true);
        }
    }