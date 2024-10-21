import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("JList Example");

        String[] items = { "item 1", "item 2", "item 3", "item 4, item 5"};

        JList<String> list = new JList<>(items);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    String selectedItem = list.getSelectedValue();
                    System.out.println("Selected item: " + selectedItem);
                }
            }
            
        });

        JScrollPane scrollPane = new JScrollPane (list);

        frame.add(scrollPane);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
