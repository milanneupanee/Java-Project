package CreatingGUI;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class ProgressBarExample {
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar();
    ProgressBarExample(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,24));
        bar.setForeground(Color.blue );
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();

    }
    public void fill(){
        int counter=0;
        while (counter<=100){
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("Done");
    }

    public static void main(String[] args) {
        new ProgressBarExample();
    }
}
