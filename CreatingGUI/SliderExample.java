package CreatingGUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderExample  implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderExample(){
        frame=new JFrame("Slider Example");
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,250));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void stateChanged(ChangeEvent e){
        label.setText("Value = "+slider.getValue());
    }
    public static void main(String[] args) {
        new SliderExample();
    }
}
