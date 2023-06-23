package CreatingGUI;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingAnonymousAddSubtract extends JFrame {
    JButton addBtn,subBtn;
    JTextField tf1, tf2,tf3;
    JLabel lbl1,lbl2;
    SwingAnonymousAddSubtract(){
        lbl1=new JLabel("First Number");
        lbl1.setBounds(20,30,150,30);
        add(lbl1);
        tf1=new JTextField();
        tf1.setBounds(20,70,150,30);
        add(tf1);
        lbl2=new JLabel("Second Number");
        lbl2.setBounds(20,110,150,30);
        add(lbl2);
        tf2=new JTextField();
        tf2.setBounds(20,150,150,30);
        add(tf2);
        addBtn=new JButton("+");
        addBtn.setBounds(20,190,50,30);
        add(addBtn);
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int n1 = Integer.parseInt(tf1.getText());
                int n2 = Integer.parseInt(tf2.getText());
                tf3.setText(String.valueOf(n1 + n2));
            }
        });
        subBtn=new JButton("-");
        subBtn.setBounds(120,190,50,30);
        add(subBtn);
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int n1 = Integer.parseInt(tf1.getText());
                int n2 = Integer.parseInt(tf2.getText());
                tf3.setText(String.valueOf(n1 - n2));
            }
        });
        tf3=new JTextField("Result");
        tf3.setBounds(20,230,150,30);
        add(tf3);
        setSize(300,300);
        setTitle("Add/Subtract");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new  SwingAnonymousAddSubtract();
    }
}