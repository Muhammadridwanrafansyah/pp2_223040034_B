import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};

        //membuat JCombobox dengan opsi
        JComboBox<String> comboBox = new JComboBox<>(options);

        //tambahkan pendengar aksi
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selected);
            }
        });

        //atur layout dan tambahkan ke frame 
        frame.setLayout(null);
        frame.add(comboBox);

        //konfigurasi frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
}
}