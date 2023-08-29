package CreatingGUI;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
public class MousePointerExample {
    JFrame frame;
   JTextField pointerInOut,pCoordinates;
    MousePointerExample (){
        frame = new JFrame("Mouse Tracker");
        pointerInOut = new JTextField("Mouse outside Frame.");
        pointerInOut.setBounds(50,30,140,30);
        pCoordinates = new JTextField("Coordinate Here");
        pCoordinates.setBounds(50,70,140,30);
        frame.add(pointerInOut);
        frame.add(pCoordinates);
//instance of MouseHandler class for event handling
        MouseHandler handler = new MouseHandler();
        frame.addMouseListener(handler);
        frame.addMouseMotionListener(handler);
        frame.setSize(300,260); //size of frame
        frame.setLayout(null); // Layout Manager null means manual
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close from application
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // close from JVM(machine)
        frame.setVisible(true);
    }
    //inner class handling MouseListener and MouseMotionListener event using MouseAdapter class
    class MouseHandler extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent me){
            pointerInOut.setText("Mouse Inside Frame");
            frame.getContentPane().setBackground(Color.white);
        }
        @Override
        public void mouseExited(MouseEvent me){
            pointerInOut.setText("Mouse Outside Frame");
            frame.getContentPane().setBackground(new Color(238,238,238));
        }
        @Override
        public void mouseMoved(MouseEvent me){
            pCoordinates.setText(String.format("[%d,%d]",me.getX(),me.getY()));
        }
    } //end of inner class
    public static void main(String[] args) {
        new MousePointerExample ();
    }
}