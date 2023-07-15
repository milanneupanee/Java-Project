package CreatingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuExample extends JFrame implements ActionListener {
    JMenuBar menubar;
    JMenu fileMenu,EditMenu,helpMenu;
    JMenuItem loadItem,saveItem,exitItem;
    MainMenuExample(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menubar=new JMenuBar();

        fileMenu=new JMenu("File");
        EditMenu=new JMenu("Edit");
        helpMenu=new JMenu("Help");

        menubar.add(fileMenu);
        menubar.add(EditMenu);
        menubar.add(helpMenu);

        loadItem=new JMenuItem("Load");
        saveItem=new JMenuItem("Save");
        exitItem=new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        this.setJMenuBar(menubar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("You load a file");
        }
        if (e.getSource()==saveItem){
            System.out.println("You save a file");
        }
        if (e.getSource()==exitItem){
            System.out.println("You exit a file");
        }
    }

    public static void main(String[] args) {
        new MainMenuExample();
    }
}
