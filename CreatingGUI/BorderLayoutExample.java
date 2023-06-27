package CreatingGUI;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BorderLayoutExample extends JFrame {
    JButton btn1,btn2,btn3,btn4,btn5;
    BorderLayoutExample(){
        setLayout(new BorderLayout(20,30));
        btn1=new JButton("NORTH");
        add(btn1,BorderLayout.NORTH);
        btn2=new JButton("SOUTH");
        add(btn2,BorderLayout.SOUTH);
        btn3=new JButton("EAST");
        add(btn3,BorderLayout.EAST);
        btn4=new JButton("WEST");
        add(btn4,BorderLayout.WEST);
        btn5=new JButton("CENTER");
        add(btn5,BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
        setTitle("BorderLayout");
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
