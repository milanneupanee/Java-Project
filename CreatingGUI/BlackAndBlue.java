package CreatingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BlackAndBlue extends JFrame implements ActionListener {
    JButton black, blue,yellow;
    JLabel label;
    BlackAndBlue() {
        label = new JLabel("Click to change background color");
        add(label);

        black = new JButton("Black");
        //black.setBounds(10, 30, 100, 30);
        add(black);
        black.addActionListener(this);

        blue = new JButton("Blue");
        //blue.setBounds(10, 60, 100, 30);
        add(blue);
        blue.addActionListener(this);

        yellow=new JButton("Yellow");
        add(yellow);
        yellow.addActionListener(this);

        setSize(500, 500);
        setTitle("Black and Blue");
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(black)) {
            getContentPane().setBackground(Color.black);
        }
        if (actionEvent.getSource().equals(blue)) {
            getContentPane().setBackground(Color.blue);
        }
        if (actionEvent.getSource().equals(yellow)) {
            getContentPane().setBackground(Color.yellow);
        }
    }
    public static void main(String[] args) {
        new BlackAndBlue();
    }
}
