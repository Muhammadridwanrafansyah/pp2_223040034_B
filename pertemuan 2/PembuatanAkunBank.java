import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Date;
import javax.swing.SpinnerNumberModel;

public class PembuatanAkunBank extends JFrame {

    public PembuatanAkunBank() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuReset = new JMenuItem("Reset");
        JMenuItem menuExit = new JMenuItem("Exit");

        menu.add(menuReset);
        menu.add(menuExit);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        JLabel labelInputNama = new JLabel("Nama:");
        labelInputNama.setBounds(15, 40, 350, 10);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30);

        JLabel labelInputHP = new JLabel("Nomer HP:");
        labelInputHP.setBounds(15, 100, 350, 10);

        JTextField textFieldHP = new JTextField();
        textFieldHP.setBounds(15, 120, 350, 30);

        JLabel labelRadio = new JLabel("Jenis Member:");
        labelRadio.setBounds(15, 160, 350, 10);

        JRadioButton radioButton1 = new JRadioButton("Laki - Laki");
        radioButton1.setBounds(15, 175, 350, 30);

        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        radioButton2.setBounds(15, 205, 350, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        JLabel labelSavingsType = new JLabel("Jenis Tabungan:");
        labelSavingsType.setBounds(15, 240, 350, 10);

        String[] savingsOptions = {"Tabungan Biasa", "Tabungan Bisnis", "Tabungan Berjangka", "Tabungan Pendidikan", "Tabungan Valas", "Tabungan Haji", "Tabungan Anak","Tabungan Hari Tua"};
        JList<String> savingsList = new JList<>(savingsOptions);

        JScrollPane scrollPaneSavingsList = new JScrollPane(savingsList);
        scrollPaneSavingsList.setBounds(15, 255, 350, 60);

        JLabel labelTransactionFreq = new JLabel("Frekuensi Transaksi per Bulan:");
        labelTransactionFreq.setBounds(15, 320, 350, 10);

        JSpinner spinnerFreq = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        spinnerFreq.setBounds(15, 335, 350, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(15, 370, 350, 10);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(15, 385, 350, 30);

        JLabel labelConfirmPassword = new JLabel("Confirm Password:");
        labelConfirmPassword.setBounds(15, 420, 350, 10);

        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(15, 435, 350, 30);

        JLabel labelTanggalLahir = new JLabel("Tanggal Lahir:");
        labelTanggalLahir.setBounds(15, 470, 350, 10);

        JSpinner spinnerTanggalLahir = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerTanggalLahir, "dd/MM/yyyy");
        spinnerTanggalLahir.setEditor(dateEditor);
        spinnerTanggalLahir.setBounds(15, 485, 350, 30);

        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 570, 350, 100);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 530, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jenisMember = "";
                if (radioButton1.isSelected()) {
                    jenisMember = radioButton1.getText();
                } else if (radioButton2.isSelected()) {
                    jenisMember = radioButton2.getText();
                }

                String nama = textFieldNama.getText();
                String nomerHP = textFieldHP.getText();
                String jenisTabungan = savingsList.getSelectedValue();
                int transaksiPerBulan = (int) spinnerFreq.getValue();
                Date tanggalLahir = (Date) spinnerTanggalLahir.getValue();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                String passwordMatchMessage = password.equals(confirmPassword) 
                        ? "Password cocok" 
                        : "Password tidak cocok";

                txtOutput.setText("Hello " + nama + "\n");
                txtOutput.append("Anda adalah member " + jenisMember + "\n");
                txtOutput.append("Nomer HP: " + nomerHP + "\n");
                txtOutput.append("Jenis Tabungan: " + jenisTabungan + "\n");
                txtOutput.append("Frekuensi Transaksi per Bulan: " + transaksiPerBulan + "\n");
                txtOutput.append("Tanggal Lahir: " + dateEditor.getFormat().format(tanggalLahir) + "\n");
                txtOutput.append(passwordMatchMessage + "\n");
            }
        });

        menuReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldNama.setText("");
                textFieldHP.setText("");
                bg.clearSelection();
                savingsList.clearSelection();
                spinnerFreq.setValue(1);
                passwordField.setText("");
                confirmPasswordField.setText("");
                spinnerTanggalLahir.setValue(new Date());
                txtOutput.setText("");
            }
        });

        menuExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(button);
        this.add(textFieldNama);
        this.add(textFieldHP);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(labelSavingsType);
        this.add(scrollPaneSavingsList);
        this.add(labelTransactionFreq);
        this.add(spinnerFreq);
        this.add(labelPassword);
        this.add(passwordField);
        this.add(labelConfirmPassword);
        this.add(confirmPasswordField);
        this.add(labelTanggalLahir);
        this.add(spinnerTanggalLahir);
        this.add(labelInputNama);
        this.add(labelInputHP);
        this.add(txtOutput);

        this.setSize(400, 750);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                PembuatanAkunBank form = new PembuatanAkunBank();
                form.setVisible(true);
            }
        });
    }
}
