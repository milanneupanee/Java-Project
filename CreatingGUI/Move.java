package CreatingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Move extends JFrame implements KeyListener {
    JLabel label;
    Move(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);
        addKeyListener(this);

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        add(label);
        getContentPane().setBackground(Color.black);

        setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        switch (keyEvent.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println("You released a key:"+keyEvent.getKeyChar());
        System.out.println("You released a key:"+keyEvent.getKeyCode());
    }
    public static void main(String[] args) {
        new Move();
    }
}
