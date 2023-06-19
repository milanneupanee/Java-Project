package CreatingGUI;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Frame;
public class UsingAssociation{
    Frame frame;
    Label lb;
    TextField tf;
    Button btn;
    UsingAssociation(){
        frame=new Frame();
        lb=new Label("First Input");
        lb.setBounds(20,30,120,40);
        frame.add(lb);
        tf=new TextField();
        tf.setBounds(20,80,120,40);
        frame.add(tf);
        btn=new Button("Click Me");
        btn.setBounds(20,130,120,40);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setTitle("First Frame");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UsingAssociation();
    }
}
