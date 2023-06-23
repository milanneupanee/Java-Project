package CreatingGUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddSubtract extends Frame implements ActionListener {
    Button addBtn,subBtn;
    TextField tf1, tf2,tf3;
    Label lbl1,lbl2;
    AddSubtract(){
        lbl1=new Label("First Number");
        lbl1.setBounds(20,30,150,30);
        add(lbl1);
        tf1=new TextField();
        tf1.setBounds(20,70,150,30);
        add(tf1);
        lbl2=new Label("Second Number");
        lbl2.setBounds(20,110,150,30);
        add(lbl2);
        tf2=new TextField();
        tf2.setBounds(20,150,150,30);
        add(tf2);
        addBtn=new Button("+");
        addBtn.setBounds(20,190,50,30);
        add(addBtn);
        addBtn.addActionListener(this);
        subBtn=new Button("-");
        subBtn.setBounds(120,190,50,30);
        add(subBtn);
        subBtn.addActionListener(this);
        tf3=new TextField("Result");
        tf3.setBounds(20,230,150,30);
        add(tf3);
        setSize(300,300);
        setTitle("Add/Subtract");
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(addBtn)){
            String num1=tf1.getText();
            String num2= tf2.getText();
            int n1=Integer.parseInt(num1);
            int n2=Integer.parseInt(num2);
            tf3.setText(String.valueOf(n1+n2));
        }
        if (ae.getSource().equals(subBtn)){
            int n1=Integer.parseInt(tf1.getText());
            int n2=Integer.parseInt(tf2.getText());
            tf3.setText(String.valueOf(n1-n2));
        }
    }

    public static void main(String[] args) {
        new AddSubtract();
    }
}