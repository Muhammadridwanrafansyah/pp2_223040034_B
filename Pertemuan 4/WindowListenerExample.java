import javax.swing.*;
import java.awt.event.*;

public class WindowListenerExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Window Listener Example");

        JLabel label = new JLabel("lakukan operasi pada jendela");
        label.setBounds(50,50,300,30);

        frame.addWindowListener(new WindowListener(){
            public void windowOpened(WindowEvent e){
                label.setText("window Opened");
            }
            public void windowClosing(WindowEvent e){
                label.setText("window Closing");
            }
            public void windowClosed(WindowEvent e){
                System.out.println("window Closed");
            }
            public void windowIconified(WindowEvent e){
                label.setText("window Minimized");
            }
            public void windowDeiconified(WindowEvent e){
                label.setText("window Restored");
            }
            public void windowActivated(WindowEvent e){
                label.setText("window Activated");
            }
            public void windowDeactivated(WindowEvent e){
                label.setText("window Deactivated");
            }

        });

        frame.add(label);
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
