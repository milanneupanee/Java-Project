package CreatingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TextStyleApp extends JFrame implements ActionListener {

    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;

    public TextStyleApp() {
        setTitle("Text Style App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        textField = new JTextField(10);
        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");
        add(textField);
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(boldCheckBox);
        checkBoxPanel.add(italicCheckBox);
        add(checkBoxPanel, BorderLayout.SOUTH);

        boldCheckBox.addActionListener(this);
        italicCheckBox.addActionListener(this);
    }
    public void actionPerformed(ActionEvent actionEvent) {
        int style = Font.PLAIN;
        if (boldCheckBox.isSelected()) {
            style = style + Font.BOLD;
        }
        if (italicCheckBox.isSelected()) {
            style = style + Font.ITALIC;
        }
        textField.setFont(new Font("Arial", style, 12));
    }
    public static void main(String[] args) {
        TextStyleApp app = new TextStyleApp();
        app.setVisible(true);
        }
    }





