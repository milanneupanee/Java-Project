package CreatingGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample extends JFrame {

    private JLabel label;

    public PopupMenuExample() {
        setTitle("Popup Menu Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Right-click within the frame to show the popup menu.");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

        // Create the popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        JMenuItem menuItem2 = new JMenuItem("Item 2");

        menuItem1.addActionListener(new MenuItemListener());
        menuItem2.addActionListener(new MenuItemListener());

        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        // Attach the popup menu to the frame
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopupMenu(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopupMenu(e);
                }
            }
        });
    }

    private void showPopupMenu(MouseEvent e) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Item 1");
        JMenuItem menuItem2 = new JMenuItem("Item 2");

        menuItem1.addActionListener(new MenuItemListener());
        menuItem2.addActionListener(new MenuItemListener());

        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);

        popupMenu.show(e.getComponent(), e.getX(), e.getY());
    }

    private class MenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuItem = (JMenuItem) e.getSource();
            label.setText(menuItem.getText() + " is selected.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PopupMenuExample example = new PopupMenuExample();
            example.setVisible(true);
        });
    }
}
