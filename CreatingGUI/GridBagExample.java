package CreatingGUI;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
public class GridBagExample extends JFrame{
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    GridBagExample(){
        GridBagLayout gbl=new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.anchor=GridBagConstraints.LINE_START;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridx=0;
        gbc.gridy=0;
        btn1=new JButton("Btn1");
        add(btn1,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        btn2=new JButton("Btn2");
        add(btn2,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        btn3=new JButton("Third Button");
        add(btn3,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        btn4=new JButton("Fourth Button");
        add(btn4,gbc);
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.gridheight=2;
        btn5=new JButton("Btn5");
        add(btn5,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=3;
        btn6=new JButton("New Button 6");
        add(btn6,gbc);
        setTitle("Grid Layout Example");
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagExample();
    }
}
