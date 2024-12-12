import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Membuat text field untuk tampilan input/output
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        // Panel untuk tombol-tombol kalkulator
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Array untuk label tombol
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        // Variabel untuk operasi kalkulator
        final double[] num = {0};  // Menyimpan angka pertama
        final String[] operator = {""};  // Menyimpan operator

        // Menambahkan tombol ke panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(button);

            // Action listener untuk tombol
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String btnText = button.getText();

                    if ("0123456789".contains(btnText)) {
                        textField.setText(textField.getText() + btnText);
                    } else if ("/*-+".contains(btnText)) {
                        num[0] = Double.parseDouble(textField.getText());
                        operator[0] = btnText;
                        textField.setText("");
                    } else if ("=".equals(btnText)) {
                        double num2 = Double.parseDouble(textField.getText());
                        double result = 0;

                        switch (operator[0]) {
                            case "+":
                                result = num[0] + num2;
                                break;
                            case "-":
                                result = num[0] - num2;
                                break;
                            case "*":
                                result = num[0] * num2;
                                break;
                            case "/":
                                if (num2 != 0) {
                                    result = num[0] / num2;
                                } else {
                                    textField.setText("Error");
                                    return;
                                }
                                break;
                        }
                        textField.setText(String.valueOf(result));
                    } else if ("C".equals(btnText)) {
                        textField.setText("");
                        num[0] = 0;
                        operator[0] = "";
                    }
                }
            });
        }

        // Menambahkan panel tombol ke frame
        frame.add(panel, BorderLayout.CENTER);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
