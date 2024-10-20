import javax.swing.*;

public class HelloRidwan {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Hello Ridwan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello,Ridwan!"); 
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() {
                createAndShowGUI();
            }

        });
    }
}