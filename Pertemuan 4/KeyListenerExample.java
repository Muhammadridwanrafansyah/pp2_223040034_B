import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Listener Example");

        JLabel label = new JLabel("tekan tombol pada keyboard");
        label.setBounds(50,50,300,30);

        JTextField textField = new JTextField();
        textField.setBounds(50,100,200,30);

        textField.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e){
                label.setText("Key Pressed: " + e.getKeyText(e.getKeyCode()));
            }
            public void keyReleased(KeyEvent e){
                label.setText("Key Released: " + e.getKeyText(e.getKeyCode()));
            }
            public void keyTyped(KeyEvent e){
                label.setText("Key Typed: " + e.getKeyChar());
            }
        });

        frame.add(textField);
        frame.add(label);

        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
