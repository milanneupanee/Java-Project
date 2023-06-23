package CreatingGUI;
import java.awt.*;
import java.awt.event.*;
public class LowerToUpper extends Frame implements ActionListener {
    Label lbl;
    Button btn;
    LowerToUpper(){
        lbl=new Label("I am lower case");
        lbl.setBounds(70,70,150,30);
        add(lbl);

        btn=new Button("Change me");
        btn.setBounds(70,110,120,30);
        add(btn);
        btn.addActionListener(this);

        setSize(300,300);
        setTitle("Lower to Upper");
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String string=lbl.getText();
        string=string.toUpperCase();
        lbl.setText(string);
    }

    public static void main(String[] args) {
        new LowerToUpper();
    }
}
