package CreatingGUI;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample extends JFrame {
    JButton []btn=new JButton[11];
    FlowLayoutExample(){
        for(int i=0;i<btn.length;i++){
            btn[i]=new JButton("B"+(i+1));
            add(btn[i]);
        }
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
