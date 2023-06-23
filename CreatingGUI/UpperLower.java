package CreatingGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UpperLower extends JFrame {
    JLabel lbl;
    JButton upBtn,lwBtn;
    UpperLower(){
        lbl=new JLabel("Upper and Lower");
        lbl.setBounds(20,20,160,30);
        add(lbl);
        upBtn=new JButton("UPPER");
        upBtn.setBounds(20,60,80,30);
        add(upBtn);
        lwBtn=new JButton("lower");
        lwBtn.setBounds(120,60,80,30);
        add(lwBtn);
        EventHandlingOutside oHandler=new EventHandlingOutside(this);
        upBtn.addActionListener(oHandler);
        lwBtn.addActionListener(oHandler);
        setSize(300,300);
        setLayout(null);
        setTitle("Upper Lower");
        setVisible(true);
    }
    public static void main(String[] args) {
        new UpperLower();
    }
}
class EventHandlingOutside implements ActionListener {
    UpperLower ul;
    EventHandlingOutside(UpperLower ul) {
        this.ul = ul;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(ul.upBtn)) {
            String l1 = ul.lbl.getText();
            l1 = l1.toUpperCase();
            ul.lbl.setText(l1);
        }

        if (ae.getSource().equals(ul.lwBtn)) {
            String l1 = ul.lbl.getText();
            l1 = l1.toLowerCase();
            ul.lbl.setText(l1);
        }
    }
}