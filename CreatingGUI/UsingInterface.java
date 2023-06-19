package CreatingGUI;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Frame;
public class UsingInterface extends Frame {
    Label lb;
    TextField tf;
    Button btn;
    UsingInterface(){
        lb=new Label("First Input");
        lb.setBounds(20,30,120,40);
        add(lb);
        tf=new TextField();
        tf.setBounds(20,80,120,40);
        add(tf);
        btn=new Button("Click Me");
        btn.setBounds(20,130,120,40);
        add(btn);
        setSize(400,400);
        setTitle("First Frame");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UsingInterface();
    }
}
