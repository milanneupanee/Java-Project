package CreatingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PickColor extends JPanel{
    JButton btn1;
    Color color =Color.red;
    PickColor(){
        setSize(300,300);
        setBackground(Color.cyan);
        btn1= new JButton("Choose color");
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Working");
                color=JColorChooser.showDialog(PickColor.this,"Chose Color",color);
                if(color==null){
                    color=Color.BLUE;
                }
                setBackground(color);
            }
        });
    }
    public static void main(String[] args) {
//        System.out.println("Is this running?");
        JFrame frame =new JFrame("Color Picker");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        PickColor pc=new PickColor();
        frame.add(pc);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
