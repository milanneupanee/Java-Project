package CreatingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccumulateApp extends JFrame {

    private JTextField textField;
    private JLabel label;
    private int result = 0;

    public AccumulateApp() {
        setTitle("Accumulate Application");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        label = new JLabel("Result: " + result);

        JButton appendButton = new JButton("Append");
        appendButton.addActionListener(new AppendButtonListener());

        setLayout(new FlowLayout());
        add(textField);
        add(appendButton);
        add(label);
        setVisible(true);
    }

    // ActionListener for the Append button
    private class AppendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int value = Integer.parseInt(textField.getText());
                result += value;
                label.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(AccumulateApp.this, "Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void main(String[] args) {

            AccumulateApp app = new AccumulateApp();


    }
}
