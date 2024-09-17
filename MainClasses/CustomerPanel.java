import MainClasses.DepositItemReceiver;
import MainClasses.Can;
import MainClasses.Bottle;
import MainClasses.Crate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerPanel extends JFrame {
    private DepositItemReceiver depositItemReceiver;
    private JTextArea receiptArea;

    public CustomerPanel() {
        depositItemReceiver = new DepositItemReceiver();
        setTitle("Recycling Machine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Buttons
        JButton canButton = new JButton("Deposit Can");
        JButton bottleButton = new JButton("Deposit Bottle");
        JButton crateButton = new JButton("Deposit Crate");
        JButton printReceiptButton = new JButton("Print Receipt");

        // Add action listeners
        canButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositItemReceiver.classifyItem(new Can(1, 0.10f));
                updateReceiptArea("Can deposited.");
            }
        });

        bottleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositItemReceiver.classifyItem(new Bottle(2, 0.20f));
                updateReceiptArea("Bottle deposited.");
            }
        });

        crateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositItemReceiver.classifyItem(new Crate(3, 0.5f));
                updateReceiptArea("Crate deposited.");
            }
        });

        printReceiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositItemReceiver.printReceipt();
            }
        });

        // GUI Layout
        JPanel panel = new JPanel();
        panel.add(canButton);
        panel.add(bottleButton);
        panel.add(crateButton);
        panel.add(printReceiptButton);
        add(panel, BorderLayout.NORTH);

        receiptArea = new JTextArea();
        add(new JScrollPane(receiptArea), BorderLayout.CENTER);
    }

    private void updateReceiptArea(String message) {
        receiptArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomerPanel().setVisible(true));
    }
}
